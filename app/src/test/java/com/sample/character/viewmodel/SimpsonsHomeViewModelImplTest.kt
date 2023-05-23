package com.sample.character.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.sample.character.repository.SimpsonsHomeRepository
import com.sample.character.repository.pojo.Icon
import com.sample.character.repository.pojo.RelatedTopic
import com.sample.character.repository.pojo.Simpsons
import com.sample.character.repository.viewstate.SimpsonsResponseState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response

@RunWith(JUnit4::class)
internal class SimpsonsHomeViewModelImplTest {

    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    @Mock
    lateinit var simpsonsHomeRepository: SimpsonsHomeRepository

    private lateinit var underTest: SimpsonsHomeViewModelImpl

    private val expectedRelatedTopics = listOf(
        RelatedTopic(
            FirstURL = "some-url",
            Icon = Icon("some-height", "some-url", "some-width"),
            Result = "some-result",
            Name = "some name",
            Text = "some name -This is my description"
        )
    )

    private val apiRelatedTopics = listOf(
        RelatedTopic(
            FirstURL = "some-url",
            Icon = Icon("some-height", "some-url", "some-width"),
            Result = "some-result",
            Name = "",
            Text = "some name -This is my description"
        )
    )

    private val expectedSuccessResponse =
        SimpsonsResponseState.Success(Simpsons(RelatedTopics = expectedRelatedTopics))

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    private suspend fun setMockSuccessResponse() {
        Mockito.`when`(simpsonsHomeRepository.getData())
            .thenReturn(Response.success(Simpsons(RelatedTopics = apiRelatedTopics)))
    }

    @Test
    fun whenGetDataThenGetDataIsCalledOnRepo() {
        runTest {
            val testDispatcher = UnconfinedTestDispatcher(testScheduler)
            Dispatchers.setMain(testDispatcher)
            underTest = SimpsonsHomeViewModelImpl(simpsonsHomeRepository, testDispatcher)
            setMockSuccessResponse()
            val observer = MyObserver()
            val data = underTest.getLiveData()
            data.observeForever(observer)
            underTest.fetchData()

            assertEquals(expectedSuccessResponse, observer.actualResponse)
            data.removeObserver(observer)
        }
    }

    class MyObserver : Observer<SimpsonsResponseState> {
        var actualResponse: SimpsonsResponseState? = null
        var randome: SimpsonsResponseState? = null

        override fun onChanged(value: SimpsonsResponseState) {
            actualResponse = value
            randome = value
        }
    }

}