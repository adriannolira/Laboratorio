/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04b;

/**
 *
 * @author spfcr
 */
public class ContaNova {

    public int nConta;
    protected String tipo;
    private double saldo;
    private String dono;
    private boolean status;

    public void abrirConta(String tt) {
        setTipo(tt);
        this.status = true;
        if ("cc".equals(tipo)) {
            this.saldo = 50;
        } else if (tipo == "cp") {
            setSaldo(100);
            /*} else {
            System.out.println("erro");
        }*/
        }
    }

    public void fecharConta() {
        if (this.status == true) {
            if (saldo > 0) {
                System.out.println("tem money");
            } else if (saldo < 0) {
                System.out.println("se limpa otário");

            } else {
                setStatus(false);
            }

        } else {
            System.out.println("já tá fechada");
        }

    }

    public void depositar(double m) {
        if (status == true) {
//saldo += m; Outra maenira de escrever
            setSaldo(getSaldo() + m);
        } else {
            System.out.println("dá não");
        }
    }

    public void sacar(double n) {
        if (status == true && this.saldo >= n) {
            setSaldo(getSaldo() - n);
        } else {
            System.out.println("impossible");
        }

    }

    public void pagarM(double d) { // esse está incompleto, eu sei
        if (saldo >= d) {
            saldo -= d;
        }

    }

    public ContaNova() {
        saldo = 0;
        this.status = false;
    }

    public void setNConta(int n) {
        nConta = n;

    }

    public int getNConta() {
        return nConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
