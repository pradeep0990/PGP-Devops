package com.practise.model;

public class Account {
private String userName;
private String password;
private String email;
private long phno;
private int cumAmountInvested;
private int cumAmountDebt;
private String room_Name;
public int getCumAmountInvested() {
    return cumAmountInvested;
}
public void setCumAmountInvested(int cumAmountInvested) {
    this.cumAmountInvested = cumAmountInvested;
}
public int getCumAmountDebt() {
    return cumAmountDebt;
}
public String getRoom_Name() {
    return room_Name;
}
public void setRoom_Name(String room_Name) {
    this.room_Name = room_Name;
}
public void setCumAmountDebt(int cumAmountDebt) {
    this.cumAmountDebt = cumAmountDebt;
}

public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public long getPhno() {
    return phno;
}
public void setPhno(long phno) {
    this.phno = phno;
}
public String getUserName() {
    return userName;
}
public void setUserName(String userName) {
    this.userName = userName;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
@Override
public String toString() {
    return "Account [userName=" + userName + ", password=" + password + ", email=" + email + ", phno=" + phno
	    + ", cumAmountInvested=" + cumAmountInvested + ", cumAmountDebt=" + cumAmountDebt + ", room_Name="
	    + room_Name + "]";
}

}
