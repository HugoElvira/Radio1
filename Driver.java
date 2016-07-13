/**
 * 
 */

/**
 * @author Pc
 *
 */
public class Driver implements RadioInterface {
	
	
	protected boolean power =false;
	protected boolean Tune_Type =false;
	protected boolean Save_Selected=false;
	protected double Tune;
	protected double AmArray[]=new double[11];
	protected double FmArray[]=new double[11];

	/**
	 * Apaga y enciende el radio
	 */
	public void ON_OFF() {
	power=!power;
	}

	/**
	 * 
	 */
	public void AM_FM() {
	Tune_Type=!Tune_Type;
	
	if (Tune_Type==false){ Tune=530;}
	if (Tune_Type==true){ Tune=87.9;}
		
	}

	@Override
	public void Cambio_de_Emisora(boolean a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Guardar_Emisora(int x) {
		if(Tune_Type==true){
			AmArray[x]=Tune;
		}
		
		if(Tune_Type==false){
			FmArray[x]=Tune;
		}
		
	}

	@Override
	public void Seleccionar_emisora_guardada(int x) {
		
		if(Tune_Type==false){
			Tune=FmArray[x];
			
			}
			
			if(Tune_Type==true){
			Tune=AmArray[x];
			
			}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Guardar_seleccion() {
		Save_Selected=!Save_Selected;
		
	}

	@Override
	public double getEmisora() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
