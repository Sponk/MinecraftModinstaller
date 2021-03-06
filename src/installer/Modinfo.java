package installer;

import java.sql.Timestamp;

public class Modinfo
{
	private String Name="", TxtDE="", TxtEN="", Source="", MC="", YouTubeDE="", YouTubeEN="", Requires=null;
	private boolean selected = false;
	private int Cat=3, Size=0, ID=0, ModID;
	private double Proz=0.0;
	private Timestamp Date=null;
	
	public void setID(int ID)
	{
		this.ID = ID;
	}
	public void setName(String name)
	{
		this.Name = name;
	}	
	public void setTextDe(String textde)
	{
		this.TxtDE = textde;
	}
	public void setTextEn(String texten)
	{
		this.TxtEN = texten;
	}
	public void setSource(String source)
	{
		this.Source = source;
	}
	public void setRating(double rating)
	{
		this.Proz = rating;
	}
	public void setSize(int size)
	{
		this.Size = size;
	}
	public void setMC(String MC)
	{
		this.MC = MC;
	}
	public void setCat(int cat)
	{
		this.Cat = cat;
	}
	public void setSelect(boolean sel)
	{
		this.selected = sel;
	}
	public void setDate(Timestamp date) {
		this.Date = date;
	}
	
	public void setYouTubeDE(String YouTubeDE) {
		this.YouTubeDE = YouTubeDE;
	}
	
	public void setYouTubeEN(String YouTubeEN) {
		this.YouTubeEN = YouTubeEN;
	}
	
	public int getID()
	{
		return ID;
	}	
	public int getModID()
	{
		return ModID;
	}
	public String getName()
	{
		return Name;
	}
	public String getText()
	{
		String name = TxtEN;		
		if(Start.lang.equals("de"))
			name = TxtDE;
		
		name = name.replace("&lt;", "<");
		name = name.replace("&gt;", ">");
		name = name.replace("&amp;", "&");
		
		return name;
	}
	public String getSource()
	{
		return Source;
	}
	public double getRating()
	{
		return Proz;
	}	
	public String getMC()
	{
		return MC;
	}	
	public int getCat()
	{
		return Cat;
	}	
	public int getSize()
	{
		return Size;
	}
	public boolean getSelect()
	{
		return selected;
	}
	public Timestamp getDate() {
		return Date;
	}
	public String getYouTube() {
		if(Start.lang.equals("en"))
			return YouTubeEN;
		else
			return YouTubeDE;
	}
	public String[] getRequires()
	{	
		if(Requires==null)
			return null;
		else
			return Requires.split(";");		
	}
}
