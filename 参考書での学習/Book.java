package 参考書での学習;

import java.sql.Date;
import java.util.Objects;


public class Book {

	private String title;
	private Date publishDate;
	private String comment;
	
	public int hashCode() {
		return Objects.hash(this.title, this.comment);
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Book)) {
			return false;
		}
		Book b = (Book)o;
		if (!publishDate.equals(b.publishDate)) {
			return false;
		}
		if (!title.equals(b.title)) {
			return false;
		}
		return true;
	}
	
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}
}
