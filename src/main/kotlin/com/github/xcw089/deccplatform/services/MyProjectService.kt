package com.github.xcw089.deccplatform.services

import com.intellij.openapi.project.Project
import com.github.xcw089.deccplatform.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
