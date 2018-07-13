package com.cg.wallet.db;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;



import com.cg.wallet.bean.Account;

public class WalletDb {
private static HashMap<String,Account> walletDb=new HashMap<String,Account>();
public static HashMap<String, Account> getWalletMap() {
return walletDb;
}

static{
	
walletDb.put("9505928555",new Account("9505928555","Rani","rani@gmail.com",2000.0));
walletDb.put("9948716777",new Account("9948716777","Vani","vani@gmail.com",1000.0));
walletDb.put("9848468242",new Account("9848468242","Hema","hema@gmail.com",1500.0));
walletDb.put("9701978539",new Account("9701978539","Mani","mani@gmail.com",2000.0));
}
}