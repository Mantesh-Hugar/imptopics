package stringClass;

public class StringBufferdemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mantesh Hugar");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" hello"));
		System.out.println(sb.charAt(3));
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.delete(2, 5));
		System.out.println(sb.indexOf("o"));
		System.out.println(sb.lastIndexOf("l"));
		System.out.println(sb.insert(0, "Software "));
		System.out.println(sb.replace(0, 8, "Testing"));
		System.out.println(sb.reverse());
		System.out.println(sb.subSequence(1, 3));
		System.out.println(sb.substring(1));
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.setCharAt(0, 'c');
		System.out.println(sb);
		sb.setLength(2);
		System.out.println(sb);
		sb.ensureCapacity(100);
		sb.append("Java");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}
