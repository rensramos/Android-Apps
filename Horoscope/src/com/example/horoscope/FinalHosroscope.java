package com.example.horoscope;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalHosroscope extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.horoscope);
		
		Intent cat=getIntent();
		String birthyear=cat.getStringExtra("birth2");
		String category=cat.getStringExtra("cate");
		
		final TextView txt1=(TextView)findViewById(R.id.textView1);
		final TextView txt2=(TextView)findViewById(R.id.textView2);
		final TextView txt3=(TextView)findViewById(R.id.textView3);
		
		if(category.equals("cate1")){
			if(birthyear.equals("1997")){//nakilumutan me kung wat year mgumpisa edit u n lng
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Ox");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1998")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Tiger");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1999")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rabbit");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1999")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2000")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2001")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Snake");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2002")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Horse");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2003")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Sheep");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2004")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Monkey");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2005")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rooster");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2006")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dog");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2007")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Pig");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2008")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rat");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2009")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Ox");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}			
			else if(birthyear.equals("2010")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Tiger");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2011")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rabbit");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2012")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2013")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Snake");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}			
			else if(birthyear.equals("2014")){
				txt1.setText("ewan1");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Horse");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
		}
		
		else if(category.equals("cate2")){
			if(birthyear.equals("1997")){//nakilumutan me kung wat year mgumpisa edit u n lng
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Ox");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1998")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Tiger");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1999")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rabbit");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1999")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2000")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2001")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Snake");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2002")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Horse");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2003")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Sheep");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2004")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Monkey");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2005")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rooster");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2006")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dog");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2007")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Pig");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2008")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rat");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2009")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Ox");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}			
			else if(birthyear.equals("2010")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Tiger");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2011")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rabbit");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2012")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2013")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Snake");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}			
			else if(birthyear.equals("2014")){
				txt1.setText("ewan2");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Horse");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
		}
		
		else if(category.equals("cate3")){
			if(birthyear.equals("1997")){//nakilumutan me kung wat year mgumpisa edit u n lng
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Ox");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1998")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Tiger");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1999")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rabbit");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("1999")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2000")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2001")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Snake");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2002")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Horse");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2003")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Sheep");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2004")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Monkey");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2005")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rooster");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2006")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dog");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2007")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Pig");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2008")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rat");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2009")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Ox");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}			
			else if(birthyear.equals("2010")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Tiger");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2011")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Rabbit");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2012")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Dragon");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
			else if(birthyear.equals("2013")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Snake");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}			
			else if(birthyear.equals("2014")){
				txt1.setText("ewan3");//nakalimutan me ung category palitan u  n lang jacky
				txt2.setText("Horse");
				txt3.setText("ikaw na bahala kung wat ung laman ng horoscope");
			}
		}
	}

}
