
        //Reversing StringBuffer
        StringBuffer a = new StringBuffer("UNIVERSITY");
        a.reverse();
        System.out.println("Reverse: " + a);

        //Comparing both StringBuffers
        StringBuffer sb1 = new StringBuffer("KIIT");
        StringBuffer sb2 = new StringBuffer("kiit");
        System.out.println("Compare: " + sb1.equals(sb2));

        //Changing cases
        StringBuffer b = new StringBuffer("STRING BUFFER");
        String n1 = b.toString();
        System.out.println("Uppercase: " + n1.toUpperCase(Locale.ROOT));
        System.out.println("Lowercase: " + n1.toLowerCase(Locale.ROOT));

