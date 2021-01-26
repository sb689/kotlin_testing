package com.example.android.architecture.blueprints.todoapp.statistics

import android.util.Log
import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

class StatisticsUtilsTest{

    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero(){

        val tasks = listOf<Task>(
                Task("title", "desc", isCompleted = false)
        )
        val result = getActiveAndCompletedStats(tasks)
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 100f)

    }

    @Test
    fun getActiveAndCompletedStats_noTask_returnsZeroZero(){

        val tasks = listOf<Task>()
        val result = getActiveAndCompletedStats(tasks)
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 0f)

    }
}