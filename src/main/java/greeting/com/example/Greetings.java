package greeting.com.example;

public class Greetings {
	
	private Integer id;
	private String content;
	
	public Greetings(Integer id, String content) {
	    super();
		this.id = id;
		this.content = content;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Greetings(Integer id, String content, String content1) {
		super();
		this.id = id;
		this.content = content;
	}
	


}
