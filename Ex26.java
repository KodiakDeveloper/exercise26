package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex26 {

	public static void main(String[] args) {

		Double grossSalary, percentual, finalValue, tax;

		DecimalFormat df = new DecimalFormat("R$ #,##0.00");

		grossSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Input gross salary: "));

		if (grossSalary < 0) {

			JOptionPane.showMessageDialog(null, "Salary cannot be negative value!");

		}

		else if (grossSalary <= 1903.98) {

			JOptionPane.showMessageDialog(null, "Gross Salary: " + df.format(grossSalary) + " remains the same!");
		}

		else if (grossSalary >= 1903.99 && grossSalary <= 2826.65) {

			percentual = 7.5;

			percentual /= 100;

			tax = grossSalary * percentual;

			finalValue = tax - 142.80;

			JOptionPane.showMessageDialog(null, "Gross Salary: " + df.format(grossSalary) + "\nTax: 7,5%"
					+ "\nAmount to Deduct: " + df.format(finalValue));

		}

		else if (grossSalary >= 2826.66 && grossSalary <= 3751.05) {

			percentual = 15.0;

			percentual /= 100;

			tax = grossSalary * percentual;

			finalValue = tax - 354.80;

			JOptionPane.showMessageDialog(null, "Gross Salary: " + df.format(grossSalary) + "\nTax: 15%"
					+ "\nAmount to Deduct: " + df.format(finalValue));
		}

		else if (grossSalary >= 3751.06 && grossSalary <= 4664.68) {

			percentual = 22.5;

			percentual /= 100;

			tax = grossSalary * percentual;

			finalValue = tax - 636.13;

			JOptionPane.showMessageDialog(null, "Gross Salary: " + df.format(grossSalary) + "\nTax: 22,5%"
					+ "\nAmount to Deduct: " + df.format(finalValue));

		}
		
		else {
			
			percentual = 27.5;

			percentual /= 100;

			tax = grossSalary * percentual;

			finalValue = tax - 869.36;

			JOptionPane.showMessageDialog(null, "Gross Salary: " + df.format(grossSalary) + "\nTax: 27,5%"
					+ "\nAmount to Deduct: " + df.format(finalValue));
		}

	}

}
