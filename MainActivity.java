package com.HRDS.pattern_1_2;

import java.util.Scanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	EditText jTextArea1;
	EditText jTextArea2;
	RadioButton jRadioButton1;
	RadioButton jRadioButton2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void P(View v){
		
		jTextArea1=(EditText) findViewById(R.id.editText1);
		jTextArea2=(EditText) findViewById(R.id.editText2);
		
		String ae1=jTextArea1.getText().toString();
		
		Scanner scanner1 = new Scanner(ae1);
		Scanner scanner2 = new Scanner(ae1);
		
		int R=jTextArea1.getLineCount();
		
		int e1=0,f1=0,m1=0,e2=0,f2=0,m2=0,e=0,f=0,m=0,a11=0,a21=0,a22=0;
		int f4=0,e4=0,m4=0,ax1=0,ax2=0,ay1=0,DH=0,DV=0,DH1=0,DV1=0,DH2=0,DV2=0;
		int se1=0,sf1=0,sm1=0,se2=0,sf2=0,sm2=0,se=0,sf=0,sm=0,sa11=0,sa21=0,sa22=0,sDH=0,sDV=0;
		int sl1=0,sl2=0,sl3=0;
		int dvd=0,dhd=0,ed=0,e3=0,f3=0,m3=0,fd=0,md=0;
		int sdvd=0,sdhd=0,sed=0,se3=0,sf3=0,sm3=0,sfd=0,smd=0;
		int largest=0,slargest=0;   //Largest horizontal numbers in a row
		int x=0;
		char a='A';
		char sa='%';
		char space='B';         //decides spaces are after or before numbers
		String ls="",sls="";
		
		int ti1;         


		String S1=scanner1.nextLine();
		String S2=scanner1.nextLine();
		String S3=scanner1.nextLine();
		String S4=scanner1.nextLine();
		String sS1=scanner2.nextLine();
		String sS2=scanner2.nextLine();
		String sS3=scanner2.nextLine();

		int ti2,ti3;
		int l1=S1.length();
		int l2=S2.length();
		int l3=S3.length();
		int l4=S4.length();
		f1=0;e1=0;m1=0;

		for(ti2=0;ti2<l1;ti2++)   //a11
		{
		char aa=S1.charAt(ti2);
		if(aa>='!')
		{
		a=aa;
		a11=a;

		break;
		}
		}

		for(ti3=0;ti3<l2;ti3++)   //a21,a22
		{
		char aa=S2.charAt(ti3);
		if(aa>='!')
		{
		a21=aa;
		for(ti2=ti3+1;ti2<l2;ti2++)
		{
		a22=S2.charAt(ti2);
		if(a22==' ')
		    continue;
		break;
		}
		break;

		}}

		int a31=0;
		for(int i=0;i<S3.length();i++)           //a31
		{
		if(S3.charAt(i)>='!')
		{
		a31=S3.charAt(i);
		break;
		}
		}

		if(l2>l3)
		{
		    largest=l2;
		    ls=S2;
		}
		else
		{
		    largest=l3;
		    ls=S3;
		}

		
		char t1=' ',t2=' ',t3=' ';
		for(ti3=0;ti3<largest;ti3++)   //dhd
		{
		char aa=ls.charAt(ti3);
		if(aa>='!')
		{
		t2=aa;
		for(ti2=ti3+1;ti2<largest;ti2++)
		{
		t3=ls.charAt(ti2);
		if(t3==' ')
		    continue;
		break;
		}
		for(ti3=ti2+1;ti3<largest;ti3++)
		{
		t1=ls.charAt(ti3);
		if(t1==' ')
		    continue;
		break;
		}
		break;

		}}

		dhd=(t1-t3)-(t3-t2);
		DV=(a21-a11);
		DH=(a22-a21);
		dvd=(a31-a21)-(a21-a11);

		if(l1>=l4)
		{
		for(ti2=0;ti2<l1;ti2++)   //To calculate e1
		{
		  char aa1=S1.charAt(ti2);
		   if(aa1==' ' && space=='A')
		    m1++;

		else if(aa1>='!')
		{
		 if(space=='A')
		space='C';
		 if(space=='B')
		space='A';
		}  
		}
		}
		else
		{for(ti2=0;ti2<l4;ti2++)   //To calculate e4
		{
		  char aa1=S4.charAt(ti2);

		  if(aa1==' ' && space=='A')
		    m4++;

		else if(aa1>='!')
		{
		 if(space=='A')
		space='C';
		 if(space=='B')
		space='A';
		}
		}

		}
		space='B';
		for(ti2=0;ti2<l1;ti2++)   //To calculate f1
		{
		  char aa1=S1.charAt(ti2);
		if(aa1==' ' && space=='B')
		    f1++;

		 else if(aa1>='!')
		{
		 break;
		}
		}

		space='B';
		for(ti2=0;ti2<l3;ti2++)   //To calculate e3 & f3
		{
		  char aa1=S3.charAt(ti2);
		if(aa1==' ' && space=='B')
		    f3++;

		  else if(aa1==' ' && space=='A')
		    m3++;

		else if(aa1>='!')
		{
		 if(space=='A')
		space='C';
		 if(space=='B')
		space='A';
		}
		}

		space='B';
		f2=0;e2=0;m2=0;
		for(ti3=0;ti3<l2;ti3++)  //To calculate e2 & f2
		{
		  char aa2=S2.charAt(ti3);
		if(aa2==' ' && space=='B')
		    f2++;

		else if(aa2==' ' && space=='A')
		    m2++;

		else if(aa2>='!')
		{   
		     if(space=='A')
		space='C';
		if(space=='B')
		space='A';
		}
		}

		if(l1<l4)
		{           
		m=m3-m2;               //To calculate m
		md=(m4-m3)-m;
		m1=m2-(m-md);
		m=m2-m1;
		}
		else{
		m=m2-m1;               //To calculate m
		md=(m3-m2)-m;
		}

		f=f2-f1;               //To calculate f
		fd=(f3-f2)-f;


		for(ti2=0;ti2<l1;ti2++)  //To calculate e1
		{
		  char aa2=S1.charAt(ti2);
		if(aa2>='!')
		{   e1++;
		    for(ti3=ti2+1,x=0;x<=m1 && ti3<l1;ti3++)
		{
		      if(S1.charAt(ti3)==' ')
		      {x++;
		            }
		      else
		          break;
		}
		    if(x>m1)
		      {break;
		            }
		}
		}

		
		for(ti2=0;ti2<l2;ti2++)  //To calculate e2
		{
		  char aa2=S2.charAt(ti2);
		if(aa2>='!')
		{   e2++;
		    for(ti3=ti2+1,x=0;x<=m2 && ti3<l2;ti3++)
		{
		      if(S2.charAt(ti3)==' ')
		      {x++;
		            }
		      else
		          break;
		}
		    if(x>m2)
		      {break;
		            }
		}
		}

		for(ti2=0;ti2<l3;ti2++)  //To calculate e3
		{
		  char aa2=S3.charAt(ti2);
		if(aa2>='!')
		{   e3++;
		   for(ti3=ti2+1,x=0;x<=m3 && ti3<l3;ti3++)
		{
		      if(S3.charAt(ti3)==' ')
		      {x++;
		            }
		      else
		          break;
		}
		    if(x>m3)
		      {break;
		            }
		}
		}

		e=e2-e1;               //To calculate e
		ed=(e3-e2)-e;



		sl1=(e1+m1*e1+f1);
		sl2=(e2+m2*e2+f2);
		sl3=(e3+m3*e3+f3);

		for(ti2=sl1;ti2<l1;ti2++)   //sa11
		{
		char aa=sS1.charAt(ti2);
		if(aa>='!')
		{
		sa=aa;
		sa11=sa;

		break;
		}
		}

		int sa31=0;
		for(int i=sl3;i<sS3.length();i++)
		{
		if(sS3.charAt(i)>='!')
		{
		sa31=sS3.charAt(i);
		break;
		}
		}

		for(ti3=sl2;ti3<l2;ti3++)   //sa21,sa22
		{
		char aa=sS2.charAt(ti3);
		if(aa>='!')
		{
		sa21=aa;
		for(ti2=ti3+1;ti2<l2;ti2++)
		{
		sa22=sS2.charAt(ti2);
		if(sa22==' ')
		    continue;
		break;
		}
		break;

		}}

		sDH=(sa22-sa21);

		space='B';
		for(ti2=sl1;ti2<l1;ti2++)   //To calculate se1 & sf1
		{
		  char aa1=S1.charAt(ti2);
		if(aa1==' ' && space=='B')
		    sf1++;

		  else if(aa1==' ' && space=='A')
		    sm1++;

		else if(aa1>='!')
		{se1++;
		 if(space=='A')
		space='C';
		 if(space=='B')
		space='A';

		}
		}
		
		space='B';
		for(ti2=sl3;ti2<l3;ti2++)   //To calculate se3 & sf3
		{
		  char aa1=S3.charAt(ti2);
		if(aa1==' ' && space=='B')
		    sf3++;

		  else if(aa1==' ' && space=='A')
		    sm3++;

		else if(aa1>='!')
		{se3++;
		 if(space=='A')
		space='C';
		 if(space=='B')
		space='A';

		}
		}
		
		space='B';
		sf2=0;se2=0;sm2=0;
		for(ti3=sl2;ti3<l2;ti3++)  //To calculate se2 & sf2
		{
		  char aa2=S2.charAt(ti3);
		if(aa2==' ' && space=='B')
		    sf2++;

		else if(aa2==' ' && space=='A')
		    sm2++;

		else if(aa2>='!')
		{   se2++;
		     if(space=='A')
		space='C';
		if(space=='B')
		space='A';

		}
		}

		int ssl=0;
		if(sl2>sl3)
		{
		    slargest=l2;
		    sls=sS2;
		    ssl=sl2;
		}
		else
		{
		    slargest=l3;
		    sls=sS3;
		    ssl=sl3;
		}
		
		char st1=' ',st2=' ',st3=' ';
		for(ti3=ssl;ti3<slargest;ti3++)   //dhd
		{
		char saa=sls.charAt(ti3);
		if(saa>='!')
		{
		st2=saa;
		for(ti2=ti3+1;ti2<slargest;ti2++)
		{
		st3=sls.charAt(ti2);
		if(st3==' ')
		    continue;
		break;
		}
		for(ti3=ti2+1;ti3<slargest;ti3++)
		{
		st1=sls.charAt(ti3);
		if(st1==' ')
		    continue;
		break;
		}
		break;

		}}

		sdhd=(st1-st3)-(st3-st2);

		
		se=se2-se1;               //To calculate se
		sf=sf2-sf1;               //To calculate sf
		sm=sm2-sm1;               //To calculate sm
		sed=(se3-se2)-se;
		sfd=(sf3-sf2)-sf;
		smd=(sm3-sm2)-sm;

		sdvd=(sa31-sa21)-(sa21-sa11);

		sDV=(sa21-sa11);
		sDH=(sa22-sa21);

		jTextArea1.setText("");
		
		if(Character.isDigit(a))
		{
		int i,j,l;                       //Final checking
		int k;
		int si,sj,sl;                      
		int sk;
		for(i=1;i<=R;i++)
		{
		for(l=1;l<=f1+f*(i-1)+(fd*(i-1)*(i-2))/2;l++)
		{
		jTextArea1.append(" ");
		}

		for(j=1,k=  ((a-48) +DV*(i-1)+(dvd*(i-1)*(i-2))/2);j<=e1+e*(i-1)+(ed*(i-1)*(i-2))/2;j++,k+=DH+(dhd*(j-2)))
		{
		jTextArea1.append(""+k);
		for(int g=1;g<=m1+m*(i-1)+(md*(i-1)*(i-2))/2;g++)
		jTextArea1.append(" ");
		}

		for(sl=1;sl<=sf1+sf*(i-1)+(sfd*(i-1)*(i-2))/2;sl++)
		{
		jTextArea1.append(" ");
		}

		for(sj=1,sk=  ((sa-48) +sDV*(i-1)+(sdvd*(i-1)*(i-2))/2);sj<=se1+se*(i-1)+(sed*(i-1)*(i-2))/2;sj++,sk+=sDH+(sdhd*(sj-2)))
		{
		jTextArea1.append(""+sk);
		for(int sg=1;sg<=sm1+sm*(i-1)+(smd*(i-1)*(i-2))/2;sg++)
		jTextArea1.append(" ");
		}

		jTextArea1.append("\n");
		}
		}
		else
		{
		int i,j,l;                       //Final checking
		char k;
		int si,sj,sl;
		char sk;
		for(i=1;i<=R;i++)
		{
		for(l=1;l<=f1+f*(i-1)+(fd*(i-1)*(i-2))/2;l++)
		{
		jTextArea1.append(" ");
		}

		for(j=1,k=  (char) (a +DV*(i-1)+(dvd*(i-1)*(i-2))/2);j<=e1+e*(i-1)+(ed*(i-1)*(i-2))/2;j++,k+=DH+(dhd*(j-2)))
		{
		jTextArea1.append(""+k);
		for(int g=1;g<=m1+m*(i-1)+(md*(i-1)*(i-2))/2;g++)
		jTextArea1.append(" ");
		}

		for(sl=1;sl<=sf1+sf*(i-1)+(sfd*(i-1)*(i-2))/2;sl++)
		{
		jTextArea1.append(" ");
		}

		for(sj=1,sk=    (char) (sa +sDV*(i-1)+(sdvd*(i-1)*(i-2))/2);sj<=se1+se*(i-1)+(sed*(i-1)*(i-2))/2;sj++,sk+=sDH+(sdhd*(sj-2)))
		{
		jTextArea1.append(""+sk);
		for(int sg=1;sg<=sm1+sm*(i-1)+(smd*(i-1)*(i-2))/2;sg++)
		jTextArea1.append(" ");
		}

		jTextArea1.append("\n");
		}
		}		
		
		{jTextArea2.setText("");
	    if(Character.isDigit(a))           //Final output
	    {
	    jTextArea2.append("int i,j,l; " +
	            "\nint k; " +
	            "\nfor(i=1;i<=+"+R+";i++)" +
	            "\n{");
	    
	    if(f1!=0 || f!=0 || fd!=0)
	     {
	        jTextArea2.append("\nfor(l=1;l<=");
	        
	        if(f1!=0)
	        jTextArea2.append(""+f1);
	        if(f!=0)
	        jTextArea2.append(" + "+f+"*(i-1)");
	        if(fd!=0)
	        jTextArea2.append("("+fd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";l++)");
	        jTextArea2.append("\n{" +
	            "\n printf(\" \");" +
	            "\n}");
	     }   
	    
	    jTextArea2.append("\nfor(j=1,k=("+a);
	    
	    if(DV!=0)
	    jTextArea2.append(" + "+ DV +"*(i - 1)");
	    if(dvd!=0)
	    jTextArea2.append("+("+dvd+"*(i-1)*(i-2))/2");
	    
	    jTextArea2.append(");j<=");
	    
	    if(e1!=0)
	    jTextArea2.append(""+e1);
	    if(e!=0)
	    jTextArea2.append(" + "+e+"*(i-1)");
	    if(ed!=0)
	    jTextArea2.append("+("+ed+"*(i-1)*(i-2))/2");
	    
	    jTextArea2.append(";j++");
	    
	    if(DH!=0)
	    jTextArea2.append(",k+="+DH);
	    if(dhd!=0)
	    jTextArea2.append("+"+dhd+"*(j-2)");
	    
	    jTextArea2.append(")\n{" +
	            "\nprintf(\"%d\",k);");
	    
	    if(m1!=0 || m!=0)
	     {
	     jTextArea2.append("\nfor(int g=1;g<=");
	     
	     if(m1!=0)
	     jTextArea2.append(""+m1);
	     if(m!=0)
	     jTextArea2.append(" + "+m+"*(i-1)");
	     if(md!=0)
	     jTextArea2.append("("+md+"*(i-1)*(i-2))/2");
	     
	     jTextArea2.append(";g++)");
	     jTextArea2.append("\nprintf(\" \");" +
	            "\n" );
	     }
	    jTextArea2.append("\n}\n");
	    
	    if(sa!='%' && Character.isDigit(sa))
	    {
	        jTextArea2.append("int si,sj,sl; " +
	            "\nint sk; ");
	        
	        if(sf1!=0 || sf !=0 || sfd!=0)
	        {
	            jTextArea2.append("\nfor(sl=1;sl<=");
	        
	        if(sf1!=0)
	        jTextArea2.append(""+sf1);
	        if(sf!=0)
	        jTextArea2.append(" + "+sf+"*(i-1)");
	        if(sfd!=0)
	        jTextArea2.append("+("+sfd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sl++)" +
	            "\n{" +
	            "\n printf(\" \");" +
	            "\n");
	        }
	        jTextArea2.append("\n}\n");
	        
	        jTextArea2.append("\nfor(sj=1,sk=("+sa);
	        
	        if(sDV!=0)
	        jTextArea2.append(" + "+ sDV +"*(i - 1)");
	        if(sdvd!=0)
	        jTextArea2.append("+("+sdvd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(");sj<="+se1);
	        
	        if(se!=0)
	        jTextArea2.append(" + "+se+"*(i-1)");
	        if(sed!=0)
	        jTextArea2.append("+("+sed+"*(i-1)*(i-2))/2");
	        if(sDH!=0)
	        jTextArea2.append(";sj++,sk+="+sDH);
	        if(sdhd!=0)
	        jTextArea2.append("+"+sdhd+"*(sj-2)");
	            
	        jTextArea2.append(")\n{" +
	            "\nprintf(\"%d\",+sk);");
	        
	        if(sm1!=0 || sm!=0)
	        {    
	        jTextArea2.append("\nfor(int sg=1;sg<=");
	        
	        if(sm1!=0)
	        jTextArea2.append(""+sm1);
	        if(sm!=0)
	        jTextArea2.append(" + "+sm+"*(i-1)");
	        if(smd!=0)
	        jTextArea2.append("("+smd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sg++)"+
	            "\nprintf(\" \");" +
	            "\n" );
	        }
	        jTextArea2.append("\n}\n");
	    }

	    else if(sa!='%')
	    {
	        jTextArea2.append("int si,sj,sl; " +
	            "\nchar sk; ");
	        
	        if(sf1!=0 || sf!=0 || sfd!=0)
	        {    
	        jTextArea2.append("\nfor(sl=1;sl<=");
	        
	        if(sf1!=0)
	        jTextArea2.append(""+sf1);
	        if(sf!=0)
	        jTextArea2.append(" + "+sf+"*(i-1)");
	        if(sfd!=0)
	        jTextArea2.append("+("+sfd+"*(i-1)*(i-2))/2;sl++)");
	        
	        jTextArea2.append("\n{" +
	            "\n printf(\" \");" +
	            "\n}");
	        }
	        
	        jTextArea2.append("\nfor(sj=1,sk=(char)(");
	        jTextArea2.append("'"+sa+"'");
	        
	        if(sDV!=0)
	        jTextArea2.append(" + "+ sDV +"*(i - 1)");
	        if(sdvd!=0)
	        jTextArea2.append("+("+sdvd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(");sj<=");
	        
	        if(se1!=0)
	        jTextArea2.append(""+se1);
	        if(se!=0)
	        jTextArea2.append(" + "+se+"*(i-1)");
	        if(sed!=0)
	        jTextArea2.append("("+sed+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sj++,sk+=");
	        
	        if(sDH!=0)
	        jTextArea2.append(""+sDH);
	        if(sdhd!=0)
	        jTextArea2.append("+"+sdhd+"*(sj-2)");
	        
	        jTextArea2.append(")\n{" +
	            "\nprintf(\"%c\",sk);");
	        
	        if(sm1!=0 || sm!=0)
	        {    
	        jTextArea2.append("\nfor(int sg=1;sg<=");
	        
	        if(sm1!=0)
	        jTextArea2.append(""+sm1);
	        if(sm!=0)
	        jTextArea2.append(" + "+sm+"*(i-1)");
	        if(smd!=0)
	        jTextArea2.append("("+smd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sg++)" +
	            "\nprintf(\" \");" +
	            "\n" );
	        }
	        jTextArea2.append("\n}\n");
	    }
	    jTextArea2.append(
	            "\nprintf(\"\\n\");" +
	            "\n}");
	    }

	    else
	    {
	    jTextArea2.append("int i,j,l; " +
	            "\nchar k; " +
	            "\nfor(i=1;i<=+"+R+";i++)" +
	            "\n{");
	    
	    if(f1!=0 || f!=0 || fd!=0)
	    {
	        jTextArea2.append("\nfor(l=1;l<=");
	        
	        if(f1!=0)
	        jTextArea2.append(""+f1);
	        if(f1!=0 && f!=0)
	        jTextArea2.append(" + ");
	        if(f!=0)
	        jTextArea2.append(""+f+"*(i-1)");
	        if((fd!=0 && f!=0)||(f1!=0 && fd!=0))
	        jTextArea2.append("+");
	        if(fd!=0)
	        jTextArea2.append("("+fd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";l++)" +
	            "\n{" +
	            "\n printf(\" \");" +
	            "\n}");
	    }
	    
	    
	    jTextArea2.append("\nfor(j=1,k= (char)('"+a +"'");
	    
	    if(DV!=0)
	    jTextArea2.append("+ "+ DV +"*(i - 1)");
	    if(dvd!=0)
	    jTextArea2.append("+("+dvd+"*(i-1)*(i-2))/2");
	    
	    jTextArea2.append(");j<=");
	    
	    if(e1!=0)
	    jTextArea2.append(""+e1);
	    if(e!=0)
	    jTextArea2.append(" + "+e+"*(i-1)");
	    if(ed!=0)
	    jTextArea2.append("+("+ed+"*(i-1)*(i-2))/2");
	    
	    jTextArea2.append(";j++,k+=");
	    
	    if(DH!=0)
	    jTextArea2.append(""+DH);
	    if(dhd!=0)
	    jTextArea2.append(""+"+"+dhd+"*(j-2)");
	    
	    jTextArea2.append(")\n{" +
	            "\nprintf(\"%c\",k);");
	    
	    
	    if(m1!=0 || m!=0 || md!=0)
	     {    
	     jTextArea2.append("\nfor(int g=1;g<=");
	     
	     if(m1!=0)
	     jTextArea2.append(""+m1);
	     if(m!=0 && m1!=0)
	     jTextArea2.append(" + ");
	     if(m!=0)
	     jTextArea2.append(""+m+"*(i-1)");
	     if((md!=0 && m!=0)||(md!=0 && m1!=0))
	     jTextArea2.append("+");
	     if(md!=0)
	     jTextArea2.append("("+md+"*(i-1)*(i-2))/2");
	     
	     jTextArea2.append(";g++)" +
	            "\nprintf(\" \");" +
	            "\n"
	            );
	     }
	     jTextArea2.append("\n}\n");
	     
	    if(sa!='%' && Character.isDigit(sa))
	    {
	        jTextArea2.append("int si,sj,sl; " +
	            "\nint sk; ");
	        
	        if(sf1!=0 || sf!=0 || sfd!=0)
	        {    
	        jTextArea2.append("\nfor(sl=1;sl<="+sf1);
	        
	        if(sf!=0)
	        jTextArea2.append(" + "+sf+"*(i-1)");
	        if(sfd!=0)
	        jTextArea2.append("+("+sfd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sl++)");
	        jTextArea2.append("\n{" +
	            "\n printf(\" \");" +
	            "\n}");
	        }
	        

	        jTextArea2.append("\nfor(sj=1,sk=("+sa);
	        
	        if(sDV!=0)
	        jTextArea2.append(" + "+ sDV +"*(i - 1)");
	        if(sdvd!=0)
	        jTextArea2.append("+("+sdvd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(");sj<=");
	        
	        if(se1!=0)
	        jTextArea2.append(""+se1);
	        if(se!=0)
	        jTextArea2.append(" + "+se+"*(i-1)");
	        if(sed!=0)
	        jTextArea2.append("+("+sed+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sj++,sk+="+sDH);
	        
	        if(sdhd!=0)
	        jTextArea2.append("+"+sdhd+"*(sj-2)");
	        
	        jTextArea2.append(")\n{" +
	            "\nprintf(\"%d\",sk);");

	        
	        if(sm1!=0 || sm!=0 || smd!=0)
	        {    
	        jTextArea2.append("\nfor(int sg=1;sg<=");
	        
	        if(sm1!=0)
	        jTextArea2.append(""+sm1);
	        if(sm!=0)
	        jTextArea2.append(" + "+sm+"*(i-1)");
	        if(smd!=0)
	        jTextArea2.append("("+smd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sg++)");
	        jTextArea2.append("\nprintf(\" \");" +
	            "\n" );
	        }
	        jTextArea2.append("\n}\n");
	    }

	    else if(sa!='%')
	    {
	        jTextArea2.append("int si,sj,sl; " +
	            "\nchar sk; ");
	    
	        if(sf1!=0 || sf!=0 || sfd!=0)
	        {
	        jTextArea2.append("\nfor(sl=1;sl<=");
	        
	        if(sf1!=0)
	        jTextArea2.append(""+sf1);
	        if(sf!=0)
	        jTextArea2.append(" + "+sf+"*(i-1)");
	        if(sfd!=0)
	        jTextArea2.append("+("+sfd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sl++)");
	                
	        jTextArea2.append("\n{" +
	            "\n printf(\" \");" +
	            "\n}");
	         
	        }
	        
	        jTextArea2.append("\nfor(sj=1,sk=(char)('"+sa +"'");
	        
	        if(sDV!=0)
	        jTextArea2.append("+"+ sDV +"*(i - 1)");
	        if(sdvd!=0)
	        jTextArea2.append("+("+sdvd+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(");sj<="+se1);
	        
	        if(se!=0)        
	        jTextArea2.append(" + "+se+"*(i-1)");
	        if(sed!=0)
	        jTextArea2.append("+("+sed+"*(i-1)*(i-2))/2");
	        
	        jTextArea2.append(";sj++,sk+=");
	        jTextArea2.append(""+sDH);
	        
	        if(sdhd!=0)
	        jTextArea2.append(""+"+"+sdhd+"*(sj-2)");
	            
	        jTextArea2.append(")\n{" +
	            "\nprintf(\"%c\",sk);");
	        
	        if(sm1!=0 || sm!=0 || smd!=0)
	        {
	            if(sm1!=0)
	            jTextArea2.append("\nfor(int sg=1;sg<="+sm1);
	            if(sm!=0)
	            jTextArea2.append(" + "+sm+"*(i-1)");
	            if(smd!=0)
	            jTextArea2.append("("+smd+"*(i-1)*(i-2))/2");
	            
	            jTextArea2.append(";sg++)" +
	            "\nprintf(\" \");" +
	            "\n" );
	        }
	        jTextArea2.append("\n}\n");
	    }

	    jTextArea2.append(
	            "\nprintf(\"\\n\");" +
	            "\n}");
	            
	    }
	  }
    }
}


