package jarai.patterns.gof.behavioral.chainOfResponsibility;


public abstract class AlexaSkill {

    protected String name;


    AlexaSkill(String name) {
        this.name = name;

    }

    public abstract void handleRequest(String anfrage);

    public abstract boolean canHandleRequest(String anfrage);



}