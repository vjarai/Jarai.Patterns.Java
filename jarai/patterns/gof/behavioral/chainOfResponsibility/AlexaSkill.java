package jarai.patterns.gof.behavioral.chainOfResponsibility;


public abstract class AlexaSkill {

    protected String name;
    protected String token;

    AlexaSkill(String name, String token) {
        this.name = name;
        this.token = token;
    }

    public abstract void handleRequest(String anfrage);

    public boolean canHandleRequest(String anfrage) {
        return anfrage.contains(token);
    }


}