package org.openmrs.module.disa;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;

/**
 * 
 * @author machabane
 *
 */
@SuppressWarnings("unused")
public class Disa {

	private int id;

	private String requestId;

	private String uuid;

	private String createdBy;

	private String createdAt;

	private String updatedBy;

	private String updatedAt;

	private String entityStatus;

	private String nid;

	private String firstName;

	private String lastName;

	private Date dateOfBirth;

	private String gender;

	private String healthFacilityLabCode;

	private String encounter;

	private String pregnant;

	private String breastFeeding;

	private String reasonForTest;

	private String harvestDate;

	private String harvestType;

	private String dateOfSampleReceive;

	private String processingDate;

	private String sampleType;

	private String viralLoadResultCopies;

	private String viralLoadResultLog;

	private String viralLoadResultDate;

	private String aprovedBy;

	private String labComments;

	private String hivViralLoadResult;

	private String requestingFacilityName;

	private String viralLoadStatus;

	private String notProcessingCause;

	public String getViralLoadStatus() {
		return viralLoadStatus;
	}

	public void setViralLoadStatus(String viralLoadStatus) {
		this.viralLoadStatus = viralLoadStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getEntityStatus() {
		return entityStatus;
	}

	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHealthFacilityLabCode() {
		return healthFacilityLabCode;
	}

	public void setHealthFacilityLabCode(String healthFacilityLabCode) {
		this.healthFacilityLabCode = healthFacilityLabCode;
	}

	public String getEncounter() {
		return encounter;
	}

	public void setEncounter(String encounter) {
		this.encounter = encounter;
	}

	public String getPregnant() {
		return pregnant;
	}

	public void setPregnant(String pregnant) {
		this.pregnant = pregnant;
	}

	public String getBreastFeeding() {
		return breastFeeding;
	}

	public void setBreastFeeding(String breastFeeding) {
		this.breastFeeding = breastFeeding;
	}

	public String getReasonForTest() {
		return reasonForTest;
	}

	public void setReasonForTest(String reasonForTest) {
		this.reasonForTest = reasonForTest;
	}

	public String getHarvestDate() {
		return harvestDate;
	}

	public void setHarvestDate(String harvestDate) {
		this.harvestDate = harvestDate;
	}

	public String getHarvestType() {
		return harvestType;
	}

	public void setHarvestType(String harvestType) {
		this.harvestType = harvestType;
	}

	public String getDateOfSampleReceive() {
		return dateOfSampleReceive;
	}

	public void setDateOfSampleReceive(String dateOfSampleReceive) {
		this.dateOfSampleReceive = dateOfSampleReceive;
	}

	public String getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getViralLoadResultCopies() {
		return viralLoadResultCopies;
	}

	public void setViralLoadResultCopies(String viralLoadResultCopies) {
		this.viralLoadResultCopies = viralLoadResultCopies;
	}

	public String getViralLoadResultLog() {
		return viralLoadResultLog;
	}

	public void setViralLoadResultLog(String viralLoadResultLog) {
		this.viralLoadResultLog = viralLoadResultLog;
	}

	public String getViralLoadResultDate() {
		return viralLoadResultDate;
	}

	public void setViralLoadResultDate(String viralLoadResultDate) {
		this.viralLoadResultDate = viralLoadResultDate;
	}

	public String getAprovedBy() {
		return aprovedBy;
	}

	public void setAprovedBy(String aprovedBy) {
		this.aprovedBy = aprovedBy;
	}

	public String getLabComments() {
		return labComments;
	}

	public void setLabComments(String labComments) {
		this.labComments = labComments;
	}

	public String getHivViralLoadResult() {
		return hivViralLoadResult;
	}

	public void setHivViralLoadResult(String hivViralLoadResult) {
		this.hivViralLoadResult = hivViralLoadResult;
	}

	public String getRequestingFacilityName() {
		return requestingFacilityName;
	}

	public void setRequestingFacilityName(String requestingFacilityName) {
		this.requestingFacilityName = requestingFacilityName;
	}

	public String getNotProcessingCause() {
		return notProcessingCause;
	}

	public void setNotProcessingCause(String notProcessingCause) {
		this.notProcessingCause = notProcessingCause;
	}

	public Integer getAge() {
		return getAge(null);
	}

	public Integer getAge(Date onDate) {
		if (dateOfBirth == null) {
			return null;
		}

		// Use default end date as today.
		Calendar today = Calendar.getInstance();
		// But if given, use the given date.
		if (onDate != null) {
			today.setTime(onDate);
		}

		Calendar bday = Calendar.getInstance();
		bday.setTime(dateOfBirth);

		int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);

		// Adjust age when today's date is before the person's birthday
		int todaysMonth = today.get(Calendar.MONTH);
		int bdayMonth = bday.get(Calendar.MONTH);
		int todaysDay = today.get(Calendar.DAY_OF_MONTH);
		int bdayDay = bday.get(Calendar.DAY_OF_MONTH);

		if (todaysMonth < bdayMonth) {
			age--;
		} else if (todaysMonth == bdayMonth && todaysDay < bdayDay) {
			// we're only comparing on month and day, not minutes, etc
			age--;
		}

		return age;
	}
}
