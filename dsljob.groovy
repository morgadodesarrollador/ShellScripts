job('groovy-Job-DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/morgadodesarrollador/ShellScripts.git', 'master'){ 
            node -> 
                node / gitConfigName('morgadodesarrollador')
                node / gitConfigEmail('morgadodesarrollador@gmail.com')
        }
    }
    triggers {
        // scm('H/7 * * * *')
        githubPush()
    }
    
    steps {
        shell("bash install.sh")
    }
}