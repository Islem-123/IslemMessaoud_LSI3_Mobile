package com.example.messaoud_islem_mesure_glycemie.model;

import android.util.Log;
import android.view.View;

public class Patient {
    private int sbAge;
    private float vGlycemie;
    private boolean jeune;

    private String resultTextView;

    public Patient(int sbAge, float vGlycemie, boolean jeune) {
        this.sbAge = sbAge;
        this.vGlycemie = vGlycemie;
        this.jeune = jeune;
    }

    public float getvGlycemie() {
        return vGlycemie;
    }

    public void setvGlycemie(float vGlycemie) {
        this.vGlycemie = vGlycemie;
    }

    public boolean isJeune() {
        return jeune;
    }

    public void setJeune(boolean jeune) {
        this.jeune = jeune;
    }

    public String getResultTextView() {
        return resultTextView;
    }



    public int getSbAge() {
        return sbAge;
    }

    public void setAge(int sbAge) {
        this.sbAge = sbAge;
    }
    public void calculer (View view)
    {

        if (jeune) {
            if (sbAge >= 13) {
                if (vGlycemie  < 5.0)
                    System.out.println("Niveau de glycémie est trop bas");
                else if (vGlycemie  >= 5.0 && vGlycemie <= 7.2)
                    System.out.println("Niveau de glycémie est normale");
                else
                    System.out.println("Niveau de glycémie est trop élevé");
            } else
            if (sbAge >= 6 && sbAge <= 12)
            {
                if (vGlycemie  < 5.0)
                    System.out.println("Niveau de glycémie est trop bas");
                else if (vGlycemie  >= 5.0 && vGlycemie  <= 10.0)
                    System.out.println("Niveau de glycémie est normale");
                else
                    System.out.println("Niveau de glycémie est trop élevé");
            }
            else
            if (sbAge < 6)
            {
                if (vGlycemie  < 5.5)
                    System.out.println("Niveau de glycémie est trop bas");
                else if (vGlycemie  >= 5.5 && vGlycemie  <= 10.0)
                    System.out.println("Niveau de glycémie est normale");
                else
                    System.out.println("Niveau de glycémie est trop élevé");
            }
        } else
        {
            if (vGlycemie  > 10.5)
                System.out.println("Niveau de glycémie est trop élevé");
            else
                System.out.println("Niveau de glycémie est normale");
        }
    }

}
