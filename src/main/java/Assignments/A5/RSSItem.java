package Assignments.A5;

public class RSSItem {
    private String title;
    private String link;
    private String publishDate;

    public RSSItem(String title, String link, String publishDate) {
        this.title = title;
        this.link = link;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getPublishDate() {
        return publishDate;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final RSSItem other = (RSSItem) obj;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle())) {
            return false;
        }
        return true;
    }
}
