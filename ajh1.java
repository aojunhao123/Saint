import java.util.Scanner;
class Bank{private static String bankname;
           private String name;
           private  String password;
           private  double balance=0;
    public String getName(){		return name;	}
    public void setName(String name){		this.name=name;	}
    public String getPassword(){		return password;	}
    public void setPassword(String password){		this.password=password;	}
    public  static String getBankname(){		return bankname;	}
    public static void  setBankname(String bankname){		Bank.bankname=bankname;	}
    public  static void welcome(){		System.out.println("欢迎来到"+bankname+"!");	}
    public    void deposit(double i){
        balance=balance-10;
        System.out.println(name+"您已开户成功，账户余额为"+balance+"元。");
    balance=i+balance;
    System.out.println("您已存入"+i+"元。账户余额为"+balance+"元。");}
    public void withdraw(String a,double b){
        if (password.equals(a))
        {if (b>balance)
            System.out.println("您的余额不足！");
        else {balance=balance-b;
              System.out.println("您已取出"+b+"元，账户余额为"+balance+"元。"); }
        }
        else {System.out.println("您输入的密码错误！");}
    }
public static void welcomeNext(){
        System.out.println("请携带您的随身物品离开，欢迎下次光临！");
}
}
public class ajh1 {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.setBankname("天地银行");
        bank.welcome();
        bank.setName("ajh");
        bank.setPassword("123456");
        bank.deposit(2000);
        bank.withdraw("123456",500);
        bank.welcomeNext();
    }
}
