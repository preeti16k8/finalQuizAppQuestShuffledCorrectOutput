package com.kre8tive.quizapp.Database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Ashet on 06-11-2017.
 */
@Entity
public class Prizes {


   private int id;
   private String prizes;
   @Generated(hash = 1440474226)
   public Prizes(int id, String prizes) {
       this.id = id;
       this.prizes = prizes;
   }
   @Generated(hash = 685947121)
   public Prizes() {
   }
   public int getId() {
       return this.id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public String getPrizes() {
       return this.prizes;
   }
   public void setPrizes(String prizes) {
       this.prizes = prizes;
   }
  


}
