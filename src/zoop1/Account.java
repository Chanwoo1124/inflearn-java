package zoop1;

public class Account {
    int balance = 0;

    public void deposit(int amount){
        balance += amount;
        System.out.println("잔액"+ balance);

    }
    public void withdraw(int amout){
        if(balance <amout){
            System.out.println("잔액 부족");
        }else{
            balance -= amout;
        }
    }
    public void result(){
        System.out.println("잔고: "+ balance);
    }
}

