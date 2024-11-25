package designATM.ATMStates;

import designATM.ATM;
import designATM.Card;


public class IdleState extends ATMState {

    public IdleState(){
        System.out.println("Hey, Welcome");
    }

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
