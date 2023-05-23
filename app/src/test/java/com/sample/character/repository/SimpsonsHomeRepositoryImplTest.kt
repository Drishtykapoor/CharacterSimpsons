package com.sample.character.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.sample.character.repository.pojo.Icon
import com.sample.character.repository.pojo.RelatedTopic
import com.sample.character.repository.pojo.Simpsons
import com.sample.character.viewmodel.SimpsonsHomeViewModelImpl
import kotlinx.coroutines.test.runTest
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
internal class SimpsonsHomeRepositoryImplTest{

    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    @Mock
    lateinit var simpsonsService: SimpsonsService

    private lateinit var underTest: SimpsonsHomeRepositoryImpl

    private val relatedTopics = listOf(
        RelatedTopic(
            FirstURL = "some-url",
            Icon = Icon("some-height", "some-url", "some-width"),
            Result = "some-result",
            Name = "some name",
            Text = "some name -This is my description"
        )
    )

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        underTest = SimpsonsHomeRepositoryImpl(simpsonsService)
    }

    private suspend fun setMockResponse() {
        Mockito.`when`(simpsonsService.getData()).thenReturn(
            Response.success(Simpsons(RelatedTopics = relatedTopics))
        )
    }

    @Test
    fun whenGetDataThenCallViewWithData() {
        runTest {
            setMockResponse()
            val response = underTest.getData()
            assertEquals(relatedTopics, response.body()!!.RelatedTopics)
        }
    }

}