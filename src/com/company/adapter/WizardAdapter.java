package com.company.adapter;

public class WizardAdapter implements Fighter {
    Wizard wizard = new Wizard();

    @Override
    public void attack() {
        double dec = Math.random();
        if (dec < 0.2) wizard.cast_spell();
        else if (dec < 0.5) wizard.fireBall();
        else if (dec < 0.8) wizard.castDestructionSpell();
        else System.out.println("failed attack!");
    }

    @Override
    public void defend() {
        double dec = Math.random();
        if (dec < 0.1) attack();
        else wizard.portal();
    }

    @Override
    public void escape() {
        double dec = Math.random();
        if (dec < 0.4) wizard.pauseTime();
        else if (dec < 0.8) wizard.blink();
        else System.out.println("failed to escape!");
    }
}
