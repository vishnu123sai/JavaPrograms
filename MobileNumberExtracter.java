printWriter p = new PrintWriter("out_put_file.txt");  // best file reader

BufferReader b = new BufferReader(new FileReader('input.txt')); // best file reader

// File f = new File(path); -> it generates a file object consists of all the file of corresponding path

// f.list() -> converts a list containg all files and folders names of File

//emain extractor

//Pattern p = Pattern.compile("[\\w][\\w_.]+@[\\w]*([.][a-zA-Z]*)*");


Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
String = b.readLine();
while(line!=null)
{
	Matcher m = p.matcher(line);
	while(m.find())
	{
			p.println(m.group());
	}
	line = b.readLine();
}
p.flush();
