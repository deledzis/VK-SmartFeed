package ru.ifmo.practice.model;

import java.util.ArrayList;

import ru.ifmo.practice.model.attachments.Audio;
import ru.ifmo.practice.model.attachments.Link;
import ru.ifmo.practice.model.attachments.Photo;
import ru.ifmo.practice.model.attachments.Video;

public class Note {
    private int                 likesCount;
    private int                 commentsCount;
    private int                 repostsCount;
    private long                id;
    private long                sourceId;
    private long                date;
    private Link                attachedLink;
    private Photo               sourcePhoto;
    private String              sourceName;
    private String              context;
    private String              contextPreview;
    private Account             signer;
    private boolean             userLikes;
    private boolean             canComment;
    private boolean             userReposted;
    private ArrayList<Photo>    attachmentsPhotos;
    private ArrayList<Video>    attachmentsVideos;
    private ArrayList<Audio>    attachmentsAudios;

    public Note(long pId,
                long pSourceId,
                String pSourceName,
                String pContext,
                String pContextPreview,
                long pDate,
                Photo pSourcePhoto,
                ArrayList<Photo> pAttachmentsPhotos,
                ArrayList<Video> pAttachmentsVideos,
                ArrayList<Audio> pAttachmentsAudios,
                int pLikesCount,
                boolean pUserLikes,
                int pCommentsCount,
                boolean pCanComment,
                int pRepostsCount,
                boolean pUserReposted) {
        id = pId;
        sourceId = pSourceId;
        sourceName = pSourceName;
        context = pContext;
        contextPreview = pContextPreview;
        date = pDate;
        sourcePhoto = pSourcePhoto;
        attachmentsPhotos = pAttachmentsPhotos;
        attachmentsVideos = pAttachmentsVideos;
        likesCount = pLikesCount;
        userLikes = pUserLikes;
        commentsCount = pCommentsCount;
        canComment = pCanComment;
        repostsCount = pRepostsCount;
        userReposted = pUserReposted;
    }

    public long getId() {
        return id;
    }

    public void setId(long pId) {
        id = pId;
    }

    public long getSourceId() {
        return sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String pContext) {
        context = pContext;
    }

    public long getDate() {
        return date;
    }

    public Photo getSourcePhoto() {
        return sourcePhoto;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int pLikesCount) {
        likesCount = pLikesCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int pCommentsCount) {
        commentsCount = pCommentsCount;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public boolean getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean pUserLikes) {
        userLikes = pUserLikes;
    }

    public boolean getCanComment() {
        return canComment;
    }

    public boolean getUserReposted() {
        return userReposted;
    }

    public String getContextPreview() {
        return contextPreview;
    }

    public Link getAttachedLink() {
        return attachedLink;
    }

    public void setAttachedLink(Link pAttachedLink) {
        attachedLink = pAttachedLink;
    }

    public ArrayList<Photo> getAttachmentsPhotos() {
        return attachmentsPhotos;
    }

    public ArrayList<Video> getAttachmentsVideos() {
        return attachmentsVideos;
    }

    public Account getSigner() {
        return signer;
    }

    public void setSigner(Account pSigner) {
        signer = pSigner;
    }

    public ArrayList<Audio> getAttachmentsAudios() {
        return attachmentsAudios;
    }

    @Override
    public String toString() {
        return "Post id" + id + "\n" +
                "Source id" + sourceId + " " + sourceName + "\n"
                + context + "\nL: " + likesCount + "| C: " + commentsCount + "| R: " +
                repostsCount + "\n"
                + "Photos: " + attachmentsPhotos.size() + "\n"
                + date;
    }
}