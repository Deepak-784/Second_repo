
// class Account {
// private String accNo;
// private String name;
// private String address;
// private String phno;
// private String dob;
// protected long balance;

// public Account(String acc, String n, String add, String phno, String dob) {
// accNo = acc;
// name = n;
// address = add;
// this.phno = phno;
// this.dob = dob;
// balance = 0;
// }

// public String getAccNo() {
// return accNo;
// }

// public String getName() {
// return name;
// }

// public String getAddress() {
// return address;
// };

// public String getPhno() {
// return phno;
// }

// public String getDOB() {
// return dob;
// }

// public long getBalance() {
// return balance;
// }

// public void setAddress(String add) {
// address = add;
// }

// public void setPhno(String phno) {
// this.phno = phno;
// }

// }

// class SavingsAccount extends Account {
// public void deposit(long amt) {
// balance += amt;
// }

// public void withdraw(long amt) {
// balance -= amt;
// }
// }

// class LoanAccount extends Account {
// public void payEMI(long amt) {
// balance -= amt;
// }

// public void repay(long amt) {
// if (balance == amt)
// balance = 0;
// }
// }

// public class SCInherit {
// public static void main(String[] args) {

// }
// }

// Error Free one :

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}

public class SCInherit {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("S123", "Alice", "City A", "9876543210", "01-01-2000");
        sa.deposit(5000);
        sa.withdraw(1500);
        System.out.println("Savings Balance: " + sa.getBalance());

        LoanAccount la = new LoanAccount("L456", "Bob", "City B", "9876543211", "02-02-1990");
        la.balance = 10000; // initial loan amount
        la.payEMI(2000);
        la.repay(8000);
        System.out.println("Loan Balance: " + la.getBalance());
    }
}
