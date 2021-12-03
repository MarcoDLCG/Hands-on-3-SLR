package Agente;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class Main extends Agent{
    protected void setup(){
        System.out.println("Regresion Polinomial");
        addBehaviour(new MyOneShotBehaviour());
    }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        public void action() {
            Cramer c = new Cramer();
            c.Datos();
        }
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}