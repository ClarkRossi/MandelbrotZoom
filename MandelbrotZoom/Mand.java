public class Mand
{
	//Mandelbrot variables
	double zx, zy, cx, cy, tmp;
	int X,Y, maxiter, iter;
	
	//Color array to hold rgb values
	int[] rgb = new int[3];

	//Set mandelbrot values
	public Mand (int x, int y, int MAX_ITER, double cX, double cY)
	{
		this.X = x;
		this.Y = y;
		this.maxiter = MAX_ITER;
		this.cx = cX;
		this.cy = cY;
	}
	
	//Performs Mandlebrot calculation for specific pixel
	public int[] pixelColor()
	{	
		//Mandelbrot Set calculation
		iter = 0;
		zx = zy = 0;
		while (zx * zx + zy * zy < 4 && iter < maxiter) {
			tmp = zx * zx - zy * zy + cx;
			zy = 2.0 * zx * zy + cy;
			zx = tmp;
			iter++;
		}
		
		//Color palette selection 
		if(iter < maxiter && iter > 0)
		{   
			int c = iter % 16;
			switch (c)
			{
				case 0:
					rgb[0] = 66;
					rgb[1] = 30;
					rgb[2] = 15;
					break;
				case 1:
					rgb[0] = 25;
					rgb[1] = 7;
					rgb[2] = 26;
					break;
				case 2:
					rgb[0] = 9;
					rgb[1] = 1;
					rgb[2] = 47;
					break;
				case 3:
					rgb[0] = 4;
					rgb[1] = 4;
					rgb[2] = 73;
					break;
				case 4:
					rgb[0] = 0;
					rgb[1] = 7;
					rgb[2] = 100;
					break;
				case 5:
					rgb[0] = 12;
					rgb[1] = 44;
					rgb[2] = 138;
					break;
				case 6:
					rgb[0] = 24;
					rgb[1] = 82;
					rgb[2] = 177;
					break;
				case 7:
					rgb[0] = 57;
					rgb[1] = 125;
					rgb[2] = 209;
					break;
				case 8:
					rgb[0] = 134;
					rgb[1] = 181;
					rgb[2] = 229;
					break;
				case 9:
					rgb[0] = 211;
					rgb[1] = 236;
					rgb[2] = 248;
					break;
				case 10:
					rgb[0] = 241;
					rgb[1] = 233;
					rgb[2] = 191;
					break;
				case 11:
					rgb[0] = 248;
					rgb[1] = 201;
					rgb[2] = 95;
					break;
				case 12:
					rgb[0] = 255;
					rgb[1] = 170;
					rgb[2] = 0;
					break;
				case 13:
					rgb[0] = 204;
					rgb[1] = 128;
					rgb[2] = 0;
					break;
				case 14:
					rgb[0] = 153;
					rgb[1] = 87;
					rgb[2] = 0;
					break;
				case 15:	
					rgb[0] = 106;
					rgb[1] = 52;
					rgb[2] = 3;
					break;
			}
		}
		return rgb;
	}
}