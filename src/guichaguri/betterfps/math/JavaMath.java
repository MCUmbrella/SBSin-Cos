package guichaguri.betterfps.math;

public class JavaMath
{
	/*public static float sin(final float a)
	{
		if(a==0.0f) {return(0.0f);}
		if(a<0) {return sin(3.14f-a);}
		float aa=a%6.28f;
		if(aa<=1.57f)
		{
			return aa*0.64f;
		}
		else if(aa>1.57f&&aa<4.71f)
		{
			return aa*-0.64f+2;
		}
		else if(aa>=4.71f)
		{
			return aa*0.64f-4;
		}
		else {System.out.println("[X] SBSIN LOGIC ERROR");return aa;}
	}*/
	public static float cos(float a){
		if(a==0.0f) {return(1.0f);}
		if(a<0) {return cos(-a);}
		float aa=a%6.28f;
		if(aa<=3.14f)
		{
			return -aa*0.64f+1;
		}
		else if(aa>3.14f)
		{
			return aa*0.64f-3;
		}
		else{System.out.println("[X] SBCOS LOGIC ERROR");return aa;}		
	}
	public static float sin(float a)
	{
		if(a==0.0f) {return(0.0f);}
		return cos(a-1.57f);
	}
	
	public static void main(String[] args)
	{
		try
		{
			java.util.Scanner x=new java.util.Scanner(System.in);
			System.out.println("started");
			for(float q;;)
			{
				q=x.nextFloat();
				System.out.println("input: "+q+", input*pi: "+q*Math.PI+"\nsin: "+sin(q)+", cos:"+cos(q));
			}

		}catch(Throwable e){System.out.println(e.toString());System.exit(0);}
	}
}
