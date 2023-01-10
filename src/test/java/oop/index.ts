class Engine {
    drive() {
        console.log('Двигатель работает')
    }
}

class Wheel {
    drive() {
        console.log('Колесо крутится')
    }
}

class Recorder {

}

class Car {
    engine: Engine;
    wheels: Wheel[];
    recorder: Recorder;

    constructor(recorder) {
        this.recorder = recorder;

        this.engine = new Engine()
        this.wheels.push(new Wheel())
        this.wheels.push(new Wheel())
        this.wheels.push(new Wheel())
        this.wheels.push(new Wheel())
    }

    drive() {
        this.engine.drive();
        for (let i = 0; i < this.wheels.length; i++) {
            this.wheels[i].drive()
        }
    }
}

const toyota = new Car()
toyota.drive()

// ts 4.4.2