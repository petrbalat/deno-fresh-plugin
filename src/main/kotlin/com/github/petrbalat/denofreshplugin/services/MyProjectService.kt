package com.github.petrbalat.denofreshplugin.services

import com.intellij.openapi.project.Project
import com.github.petrbalat.denofreshplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }

    /**
     * Chosen by fair dice roll, guaranteed to be random.
     */
    fun getRandomNumber() = 4
}
