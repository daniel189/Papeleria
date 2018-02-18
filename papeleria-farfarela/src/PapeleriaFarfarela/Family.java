/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PapeleriaFarfarela;

/**
 *
 * @author Daniel
 */
public class Family {
  private int damilyId;
private String familyName;
private String familyDetails;

    /**
     * @return the damilyId
     */
    public int getFamilyId() {
        return damilyId;
    }

    /**
     * @param familyId the damilyId to set
     */
    public void setFamilyId(int familyId) {
        this.damilyId = familyId;
    }

    /**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * @param familyName the familyName to set
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * @return the familyDetails
     */
    public String getFamilyDetail() {
        return familyDetails;
    }

    /**
     * @param familyDetail the familyDetails to set
     */
    public void setFamilyDetail(String familyDetail) {
        this.familyDetails = familyDetail;
    }

 
}
