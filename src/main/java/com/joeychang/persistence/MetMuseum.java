package com.joeychang.persistence;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MetMuseum {

	@JsonProperty("artistDisplayName")
	private String artistDisplayName;

	@JsonProperty("country")
	private String country;

	@JsonProperty("objectDate")
	private String objectDate;

	@JsonProperty("geographyType")
	private String geographyType;

	@JsonProperty("objectURL")
	private String objectURL;

	@JsonProperty("isHighlight")
	private boolean isHighlight;

	@JsonProperty("reign")
	private String reign;

	@JsonProperty("county")
	private String county;

	@JsonProperty("objectEndDate")
	private int objectEndDate;

	@JsonProperty("artistGender")
	private String artistGender;

	@JsonProperty("repository")
	private String repository;

	@JsonProperty("dynasty")
	private String dynasty;

	@JsonProperty("portfolio")
	private String portfolio;

	@JsonProperty("excavation")
	private String excavation;

	@JsonProperty("state")
	private String state;

	@JsonProperty("artistAlphaSort")
	private String artistAlphaSort;

	@JsonProperty("period")
	private String period;

	@JsonProperty("primaryImage")
	private String primaryImage;

	@JsonProperty("subregion")
	private String subregion;

	@JsonProperty("classification")
	private String classification;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	@JsonProperty("objectWikidata_URL")
	private String objectWikidataURL;

	@JsonProperty("isTimelineWork")
	private boolean isTimelineWork;

	@JsonProperty("accessionYear")
	private String accessionYear;

	@JsonProperty("region")
	private String region;

	@JsonProperty("primaryImageSmall")
	private String primaryImageSmall;

	@JsonProperty("isPublicDomain")
	private boolean isPublicDomain;

	@JsonProperty("artistSuffix")
	private String artistSuffix;

	@JsonProperty("city")
	private String city;

	@JsonProperty("linkResource")
	private String linkResource;

	@JsonProperty("artistPrefix")
	private String artistPrefix;

	@JsonProperty("artistWikidata_URL")
	private String artistWikidataURL;

	@JsonProperty("medium")
	private String medium;

	@JsonProperty("title")
	private String title;

	@JsonProperty("locale")
	private String locale;

	@JsonProperty("accessionNumber")
	private String accessionNumber;

	@JsonProperty("artistEndDate")
	private String artistEndDate;

	@JsonProperty("rightsAndReproduction")
	private String rightsAndReproduction;

	@JsonProperty("metadataDate")
	private String metadataDate;

	@JsonProperty("creditLine")
	private String creditLine;

	@JsonProperty("artistRole")
	private String artistRole;

	@JsonProperty("department")
	private String department;

	@JsonProperty("measurements")
	private List<MeasurementsItem> measurements;

	@JsonProperty("additionalImages")
	private List<String> additionalImages;

	@JsonProperty("GalleryNumber")
	private String galleryNumber;

	@JsonProperty("objectBeginDate")
	private int objectBeginDate;

	@JsonProperty("artistBeginDate")
	private String artistBeginDate;

	@JsonProperty("artistULAN_URL")
	private String artistULANURL;

	@JsonProperty("culture")
	private String culture;

	@JsonProperty("artistNationality")
	private String artistNationality;

	@JsonProperty("objectName")
	private String objectName;

	@JsonProperty("artistDisplayBio")
	private String artistDisplayBio;

	@JsonProperty("locus")
	private String locus;

	@JsonProperty("river")
	private String river;

	@JsonProperty("constituents")
	private List<ConstituentsItem> constituents;

	@JsonProperty("objectID")
	private int objectID;

	@JsonProperty("dimensions")
	private String dimensions;

	public void setArtistDisplayName(String artistDisplayName){
		this.artistDisplayName = artistDisplayName;
	}

	public String getArtistDisplayName(){
		return artistDisplayName;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setObjectDate(String objectDate){
		this.objectDate = objectDate;
	}

	public String getObjectDate(){
		return objectDate;
	}

	public void setGeographyType(String geographyType){
		this.geographyType = geographyType;
	}

	public String getGeographyType(){
		return geographyType;
	}

	public void setObjectURL(String objectURL){
		this.objectURL = objectURL;
	}

	public String getObjectURL(){
		return objectURL;
	}

	public void setIsHighlight(boolean isHighlight){
		this.isHighlight = isHighlight;
	}

	public boolean isIsHighlight(){
		return isHighlight;
	}

	public void setReign(String reign){
		this.reign = reign;
	}

	public String getReign(){
		return reign;
	}

	public void setCounty(String county){
		this.county = county;
	}

	public String getCounty(){
		return county;
	}

	public void setObjectEndDate(int objectEndDate){
		this.objectEndDate = objectEndDate;
	}

	public int getObjectEndDate(){
		return objectEndDate;
	}

	public void setArtistGender(String artistGender){
		this.artistGender = artistGender;
	}

	public String getArtistGender(){
		return artistGender;
	}

	public void setRepository(String repository){
		this.repository = repository;
	}

	public String getRepository(){
		return repository;
	}

	public void setDynasty(String dynasty){
		this.dynasty = dynasty;
	}

	public String getDynasty(){
		return dynasty;
	}

	public void setPortfolio(String portfolio){
		this.portfolio = portfolio;
	}

	public String getPortfolio(){
		return portfolio;
	}

	public void setExcavation(String excavation){
		this.excavation = excavation;
	}

	public String getExcavation(){
		return excavation;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setArtistAlphaSort(String artistAlphaSort){
		this.artistAlphaSort = artistAlphaSort;
	}

	public String getArtistAlphaSort(){
		return artistAlphaSort;
	}

	public void setPeriod(String period){
		this.period = period;
	}

	public String getPeriod(){
		return period;
	}

	public void setPrimaryImage(String primaryImage){
		this.primaryImage = primaryImage;
	}

	public String getPrimaryImage(){
		return primaryImage;
	}

	public void setSubregion(String subregion){
		this.subregion = subregion;
	}

	public String getSubregion(){
		return subregion;
	}

	public void setClassification(String classification){
		this.classification = classification;
	}

	public String getClassification(){
		return classification;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setObjectWikidataURL(String objectWikidataURL){
		this.objectWikidataURL = objectWikidataURL;
	}

	public String getObjectWikidataURL(){
		return objectWikidataURL;
	}

	public void setIsTimelineWork(boolean isTimelineWork){
		this.isTimelineWork = isTimelineWork;
	}

	public boolean isIsTimelineWork(){
		return isTimelineWork;
	}

	public void setAccessionYear(String accessionYear){
		this.accessionYear = accessionYear;
	}

	public String getAccessionYear(){
		return accessionYear;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setPrimaryImageSmall(String primaryImageSmall){
		this.primaryImageSmall = primaryImageSmall;
	}

	public String getPrimaryImageSmall(){
		return primaryImageSmall;
	}

	public void setIsPublicDomain(boolean isPublicDomain){
		this.isPublicDomain = isPublicDomain;
	}

	public boolean isIsPublicDomain(){
		return isPublicDomain;
	}

	public void setArtistSuffix(String artistSuffix){
		this.artistSuffix = artistSuffix;
	}

	public String getArtistSuffix(){
		return artistSuffix;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setLinkResource(String linkResource){
		this.linkResource = linkResource;
	}

	public String getLinkResource(){
		return linkResource;
	}

	public void setArtistPrefix(String artistPrefix){
		this.artistPrefix = artistPrefix;
	}

	public String getArtistPrefix(){
		return artistPrefix;
	}

	public void setArtistWikidataURL(String artistWikidataURL){
		this.artistWikidataURL = artistWikidataURL;
	}

	public String getArtistWikidataURL(){
		return artistWikidataURL;
	}

	public void setMedium(String medium){
		this.medium = medium;
	}

	public String getMedium(){
		return medium;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setAccessionNumber(String accessionNumber){
		this.accessionNumber = accessionNumber;
	}

	public String getAccessionNumber(){
		return accessionNumber;
	}

	public void setArtistEndDate(String artistEndDate){
		this.artistEndDate = artistEndDate;
	}

	public String getArtistEndDate(){
		return artistEndDate;
	}

	public void setRightsAndReproduction(String rightsAndReproduction){
		this.rightsAndReproduction = rightsAndReproduction;
	}

	public String getRightsAndReproduction(){
		return rightsAndReproduction;
	}

	public void setMetadataDate(String metadataDate){
		this.metadataDate = metadataDate;
	}

	public String getMetadataDate(){
		return metadataDate;
	}

	public void setCreditLine(String creditLine){
		this.creditLine = creditLine;
	}

	public String getCreditLine(){
		return creditLine;
	}

	public void setArtistRole(String artistRole){
		this.artistRole = artistRole;
	}

	public String getArtistRole(){
		return artistRole;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public String getDepartment(){
		return department;
	}

	public void setMeasurements(List<MeasurementsItem> measurements){
		this.measurements = measurements;
	}

	public List<MeasurementsItem> getMeasurements(){
		return measurements;
	}

	public void setAdditionalImages(List<String> additionalImages){
		this.additionalImages = additionalImages;
	}

	public List<String> getAdditionalImages(){
		return additionalImages;
	}

	public void setGalleryNumber(String galleryNumber){
		this.galleryNumber = galleryNumber;
	}

	public String getGalleryNumber(){
		return galleryNumber;
	}

	public void setObjectBeginDate(int objectBeginDate){
		this.objectBeginDate = objectBeginDate;
	}

	public int getObjectBeginDate(){
		return objectBeginDate;
	}

	public void setArtistBeginDate(String artistBeginDate){
		this.artistBeginDate = artistBeginDate;
	}

	public String getArtistBeginDate(){
		return artistBeginDate;
	}

	public void setArtistULANURL(String artistULANURL){
		this.artistULANURL = artistULANURL;
	}

	public String getArtistULANURL(){
		return artistULANURL;
	}

	public void setCulture(String culture){
		this.culture = culture;
	}

	public String getCulture(){
		return culture;
	}

	public void setArtistNationality(String artistNationality){
		this.artistNationality = artistNationality;
	}

	public String getArtistNationality(){
		return artistNationality;
	}

	public void setObjectName(String objectName){
		this.objectName = objectName;
	}

	public String getObjectName(){
		return objectName;
	}

	public void setArtistDisplayBio(String artistDisplayBio){
		this.artistDisplayBio = artistDisplayBio;
	}

	public String getArtistDisplayBio(){
		return artistDisplayBio;
	}

	public void setLocus(String locus){
		this.locus = locus;
	}

	public String getLocus(){
		return locus;
	}

	public void setRiver(String river){
		this.river = river;
	}

	public String getRiver(){
		return river;
	}

	public void setConstituents(List<ConstituentsItem> constituents){
		this.constituents = constituents;
	}

	public List<ConstituentsItem> getConstituents(){
		return constituents;
	}

	public void setObjectID(int objectID){
		this.objectID = objectID;
	}

	public int getObjectID(){
		return objectID;
	}

	public void setDimensions(String dimensions){
		this.dimensions = dimensions;
	}

	public String getDimensions(){
		return dimensions;
	}

	@Override
 	public String toString(){
		return 
			"ChicagoArts{" + 
			"artistDisplayName = '" + artistDisplayName + '\'' + 
			",country = '" + country + '\'' + 
			",objectDate = '" + objectDate + '\'' + 
			",geographyType = '" + geographyType + '\'' + 
			",objectURL = '" + objectURL + '\'' + 
			",isHighlight = '" + isHighlight + '\'' + 
			",reign = '" + reign + '\'' + 
			",county = '" + county + '\'' + 
			",objectEndDate = '" + objectEndDate + '\'' + 
			",artistGender = '" + artistGender + '\'' + 
			",repository = '" + repository + '\'' + 
			",dynasty = '" + dynasty + '\'' + 
			",portfolio = '" + portfolio + '\'' + 
			",excavation = '" + excavation + '\'' + 
			",state = '" + state + '\'' + 
			",artistAlphaSort = '" + artistAlphaSort + '\'' + 
			",period = '" + period + '\'' + 
			",primaryImage = '" + primaryImage + '\'' + 
			",subregion = '" + subregion + '\'' + 
			",classification = '" + classification + '\'' + 
			",tags = '" + tags + '\'' + 
			",objectWikidata_URL = '" + objectWikidataURL + '\'' + 
			",isTimelineWork = '" + isTimelineWork + '\'' + 
			",accessionYear = '" + accessionYear + '\'' + 
			",region = '" + region + '\'' + 
			",primaryImageSmall = '" + primaryImageSmall + '\'' + 
			",isPublicDomain = '" + isPublicDomain + '\'' + 
			",artistSuffix = '" + artistSuffix + '\'' + 
			",city = '" + city + '\'' + 
			",linkResource = '" + linkResource + '\'' + 
			",artistPrefix = '" + artistPrefix + '\'' + 
			",artistWikidata_URL = '" + artistWikidataURL + '\'' + 
			",medium = '" + medium + '\'' + 
			",title = '" + title + '\'' + 
			",locale = '" + locale + '\'' + 
			",accessionNumber = '" + accessionNumber + '\'' + 
			",artistEndDate = '" + artistEndDate + '\'' + 
			",rightsAndReproduction = '" + rightsAndReproduction + '\'' + 
			",metadataDate = '" + metadataDate + '\'' + 
			",creditLine = '" + creditLine + '\'' + 
			",artistRole = '" + artistRole + '\'' + 
			",department = '" + department + '\'' + 
			",measurements = '" + measurements + '\'' + 
			",additionalImages = '" + additionalImages + '\'' + 
			",galleryNumber = '" + galleryNumber + '\'' + 
			",objectBeginDate = '" + objectBeginDate + '\'' + 
			",artistBeginDate = '" + artistBeginDate + '\'' + 
			",artistULAN_URL = '" + artistULANURL + '\'' + 
			",culture = '" + culture + '\'' + 
			",artistNationality = '" + artistNationality + '\'' + 
			",objectName = '" + objectName + '\'' + 
			",artistDisplayBio = '" + artistDisplayBio + '\'' + 
			",locus = '" + locus + '\'' + 
			",river = '" + river + '\'' + 
			",constituents = '" + constituents + '\'' + 
			",objectID = '" + objectID + '\'' + 
			",dimensions = '" + dimensions + '\'' + 
			"}";
		}
}