
//Son Ngo

import javax.swing.JOptionPane;

public class Week12_Lab2
{
	public static void main(String[]args)

	{
		int iDices, iBounces, iRoll;

		iDices = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dices: "));
		iBounces = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of bounces: "));
		Dice dice = new Dice(iBounces);
		if (iBounces == 1)
			iRoll = dice.Throw(iDices);
		else
			iRoll = dice.Throw(iDices, iBounces);
		JOptionPane.showMessageDialog(null, iRoll);
	}
}
