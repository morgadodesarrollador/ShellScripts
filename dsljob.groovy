import jenkins-auto-approve-script.groovy

job('groovy-Job-DSL') {
    description('Job DSL yyy por Groovy desde GitHub')
}


    // scm {
    //     git('https://github.com/morgadodesarrollador/ShellScripts.git', 'master'){ 
    //         node -> 
    //             node / gitConfigName('morgadodesarrollador')
    //             node / gitConfigEmail('morgadodesarrollador@gmail.com')
    //     }
    // }
    // triggers {
    //     githubPush()
    // }
    
    // steps {
    //     shell("bash install.sh")
    // }
//}