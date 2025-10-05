package org.example

class Utils {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def sayHelloJenkins() {
        steps.echo "Hello Jenkins from Utility Class!"
    }
}
