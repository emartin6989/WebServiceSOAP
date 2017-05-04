package metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Compte {
private int code;
private float solde;
private Date dateCreation;
/**
 * @return the code
 */
public int getCode() {
	return code;
}
/**
 * @param code the code to set
 */
public void setCode(int code) {
	this.code = code;
}
/**
 * @return the solde
 */
public float getSolde() {
	return solde;
}
/**
 * @param solde the solde to set
 */
public void setSolde(float solde) {
	this.solde = solde;
}
/**
 * @return the dateCreation
 */
public Date getDateCreation() {
	return dateCreation;
}
/**
 * @param dateCreation the dateCreation to set
 */
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
}



}
