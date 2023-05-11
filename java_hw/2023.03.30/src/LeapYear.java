class LeapYear {
    int year;
    LeapYear(int year){
        this.year = year;
    }
    public void judge3(){
      if(year % 4 == 0 && year % 100 != 0)
      System.out.println(year+"是闰年");
      else if(year % 400 == 0)
      System.out.println(year+"是闰年");
      else
      System.out.println(year+"不是闰年");
    }
}

