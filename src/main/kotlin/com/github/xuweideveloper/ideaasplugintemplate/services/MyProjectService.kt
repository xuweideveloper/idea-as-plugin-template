package com.github.xuweideveloper.ideaasplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.xuweideveloper.ideaasplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
