/**
 * Kelas SavingsAccount merupakan kelas untuk mengontrol jumlah balance melalui withdraw
 * dan deposit
 * @author Pemrogaman Berorientasi Objek 01 - Kelompok 10 
 * @version 2, Juni 2021
 */
public class SavingsAccount
{
public float balance;
//@param anAmount 
public void withdraw(float anAmount)// method pengambilan dari nilai balance
{
if (anAmount<0.0)
throw new IllegalArgumentException("Withdraw amount negative");
if (anAmount <= balance){
	synchronized(this){
	    balance = balance - anAmount;
	   }
}
}
public void deposit(float anAmount)// method penyetoran ke nilai balance
{
if (anAmount<0.0)
throw new IllegalArgumentException("Deposit amount negative");
synchronized(this){
balance = balance + anAmount;
}
}
//@return String nilai dari balance
public String toString()//method menetukan value yang dicetak mencetak 
{
        return String.valueOf(balance);
    }
}