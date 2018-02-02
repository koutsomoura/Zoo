

public class Animals {
	String text;
	double size;
	String local;
	String edit;
	
	public Animals() {
		this.text=getText();
		this.size=getSize();
		this.local=getLocal();
	}
	public void setText(String x) {
		this.text=x;
	}
	public String getText() {
		return text;
	}
	public void setSize(double y) {
		this.size=y;
	}
	public double getSize() {
		return size;
	}
	public void setLocal(String z) {
		this.local=z;
	}
	public String getLocal() {
		return local;
	}
	public String toString() {
		return text+"\nSize max can be: "+size+"\nLocal variable:"+local;
	}
	public String toStringSave() {
		return text+" "+size+" "+local+"\n";
	}
	public void setEdit(String edit) {
		this.edit=edit;
	}
	public String edit() {
		return getText()+" "+edit;
	}
	public String toStringSaveEdit() {
		return edit()+" "+size+" "+local+"\n";
	}
	
	
	
	
}
