package entidad;

import java.sql.Timestamp;

public class Cuentas {

	private int NroDeCuenta;
	private TipoDeCuentas TipoDeCuenta;
	private Timestamp FechaCreacion;
	private String Cbu;
	private float Saldo;
	
	
	public Cuentas()
	{
		
	}
	
	public Cuentas ( int NroDeCuenta, TipoDeCuentas TipoDeCuenta,Timestamp FechaCreacion, String Cbu, float Saldo )
	{
		this.TipoDeCuenta = TipoDeCuenta;
		this.NroDeCuenta = NroDeCuenta;
		this.FechaCreacion= FechaCreacion;
		this.Cbu= Cbu;
		this.Saldo= Saldo;
		
	}

	
	public TipoDeCuentas getIdTipoDeCuenta() {
		return TipoDeCuenta;
	}


	public void setIdTipoDeCuenta(TipoDeCuentas tipoDeCuenta) {
		TipoDeCuenta = tipoDeCuenta;
	}


	public int getNroDeCuenta() {
		return NroDeCuenta;
	}


	public void setNroDeCuenta(int nroDeCuenta) {
		NroDeCuenta = nroDeCuenta;
	}


	public Timestamp getFechaCreacion() {
		return FechaCreacion;
	}


	public void setFechaCreacion(Timestamp fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}


	public String getCbu() {
		return Cbu;
	}


	public void setCbu(String cbu) {
		Cbu = cbu;
	}


	public float getSaldo() {
		return Saldo;
	}


	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Cuentas [IdTipoDeCuenta=" + TipoDeCuenta.getIdTipodeCuenta() +TipoDeCuenta.getDescripcion() + ", NroDeCuenta=" + NroDeCuenta + ", FechaCreacion="
				+ FechaCreacion + ", Cbu=" + Cbu + ", Saldo=" + Saldo + "]";
	}

}