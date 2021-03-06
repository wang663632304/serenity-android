/**
 * The MIT License (MIT)
 * Copyright (c) 2012 David Carver
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF
 * OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package us.nineworlds.serenity.core.model.impl;

import java.io.Serializable;
import java.util.List;

import us.nineworlds.serenity.core.model.VideoContentInfo;

/**
 * General information common t TV Shows and Videos/Movies
 * 
 * @author dcarver
 * 
 */
public abstract class AbstractVideoContentInfo implements VideoContentInfo, Serializable {

	private static final long serialVersionUID = 4744447508883279194L;

	private String id;

	private String plotSummary;
	private String castInfo;
	private String posterURL;
	private String parentPosterURL;
	private String grandeParentPosterURL;
	private String backgroundURL;
	private String title;
	private String contentRating;
	private String audioCodec;
	private String videoCodec;
	private String videoResolution;
	private List<String> actors;
	private List<String> directors;
	private List<String> genres;
	private List<String> writers;
	private String year;
	private String directPlayUrl;
	private String aspectRatio;
	private int viewCount;
	private String audioChannels;
	private int resumeOffset;
	private int duration;

	private String season;
	private String episodeNumber;
	private String originalAirDate;
	private String container;
	private String seriesTitle;
	
	private Subtitle subtitle;
	
	private String mediaTagIdentifier;
	private String studio;
	private double rating;
	private String parentURL;

	public String getSeriesTitle() {
		return seriesTitle;
	}

	public Subtitle getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
	}

	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public String getOriginalAirDate() {
		return originalAirDate;
	}

	public void setOriginalAirDate(String originalAirDate) {
		this.originalAirDate = originalAirDate;
	}

	public int getResumeOffset() {
		return resumeOffset;
	}

	public void setResumeOffset(int resumeOffset) {
		this.resumeOffset = resumeOffset;
	}

	public String id() {
		return id;
	}

	public String getParentPosterURL() {
		return parentPosterURL;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * getDirectPlayUrl()
	 */
	public String getDirectPlayUrl() {
		return directPlayUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * setDirectPlayUrl(java.lang.String)
	 */
	public void setDirectPlayUrl(String directPlayUrl) {
		this.directPlayUrl = directPlayUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getActors
	 * ()
	 */
	public List<String> getActors() {
		return actors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getAudioCodec
	 * ()
	 */
	public String getAudioCodec() {
		return audioCodec;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * getBackgroundURL()
	 */
	public String getBackgroundURL() {
		return backgroundURL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getCastInfo
	 * ()
	 */
	public String getCastInfo() {
		return castInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * getContentRating()
	 */
	public String getContentRating() {
		return contentRating;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getDirectors
	 * ()
	 */
	public List<String> getDirectors() {
		return directors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getGenres
	 * ()
	 */
	public List<String> getGenres() {
		return genres;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * getPlotSummary()
	 */
	public String getSummary() {
		return plotSummary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getPosterURL
	 * ()
	 */
	public String getImageURL() {
		return posterURL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getTitle
	 * ()
	 */
	public String getTitle() {
		return title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getVideoCodec
	 * ()
	 */
	public String getVideoCodec() {
		return videoCodec;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * getVideoResolution()
	 */
	public String getVideoResolution() {
		return videoResolution;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getWriters
	 * ()
	 */
	public List<String> getWriters() {
		return writers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#getYear()
	 */
	public String getYear() {
		return year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setActors
	 * (java.util.List)
	 */
	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setAudioCodec
	 * (java.lang.String)
	 */
	public void setAudioCodec(String audioCodec) {
		this.audioCodec = audioCodec;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * setBackgroundURL(java.lang.String)
	 */
	public void setBackgroundURL(String backgroundURL) {
		this.backgroundURL = backgroundURL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setCastInfo
	 * (java.lang.String)
	 */
	public void setCastInfo(String castInfo) {
		this.castInfo = castInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * setContentRating(java.lang.String)
	 */
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setDirectors
	 * (java.util.List)
	 */
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setGenres
	 * (java.util.List)
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * setPlotSummary(java.lang.String)
	 */
	public void setSummary(String plotSummary) {
		this.plotSummary = plotSummary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setPosterURL
	 * (java.lang.String)
	 */
	public void setImageURL(String posterURL) {
		this.posterURL = posterURL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setTitle
	 * (java.lang.String)
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setVideoCodec
	 * (java.lang.String)
	 */
	public void setVideoCodec(String videoCodec) {
		this.videoCodec = videoCodec;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.kingargyle.plexappclient.core.model.VideoContentInfo#
	 * setVideoResolution(java.lang.String)
	 */
	public void setVideoResolution(String videoResolution) {
		this.videoResolution = videoResolution;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setWriters
	 * (java.util.List)
	 */
	public void setWriters(List<String> writers) {
		this.writers = writers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.github.kingargyle.plexappclient.core.model.VideoContentInfo#setYear
	 * (java.lang.String)
	 */
	public void setYear(String year) {
		this.year = year;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setParentPosterURL(String parentPosterURL) {
		this.parentPosterURL = parentPosterURL;
	}
	
	public void setGrandParentPosterURL(String posterURL) {
		this.grandeParentPosterURL = posterURL;
	}
	
	public String getGrandParentPosterURL() {
		return this.grandeParentPosterURL;
	}

	public String getAudioChannels() {
		return this.audioChannels;
	}

	public void setAudioChannels(String audioChannels) {
		this.audioChannels = audioChannels;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getMediaTagIdentifier() {
		return mediaTagIdentifier;
	}

	public void setMediaTagIdentifier(String mediaTagIdentifier) {
		this.mediaTagIdentifier = mediaTagIdentifier;
	}
	
	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	public String getStudio() {
		return studio;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getParentKey() {
		return parentURL;
	}
	
	public void setParentKey(String parentKey) {
		this.parentURL = parentKey;
	}
}
