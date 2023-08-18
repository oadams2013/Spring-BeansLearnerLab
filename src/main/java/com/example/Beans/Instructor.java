package com.example.Beans;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
    int ctr = 0;
        for (Learner l : learners) {
            ctr++;

        }double numberOfHoursPerLearner = numberOfHours/ctr;
    }
}
