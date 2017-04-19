def splitter(m):
    x = m.split('->')
    p=x[0] # A
    l=x[1] #aBcdE
    if len(l)==1:
        if l.islower():
            print m 
            print '<'+l+'>'+'->'+l  
            exit 
        else:
            print m
    else:
        k = l.split(l[0])
        p=l[0] #a
        r=k[1] #BcdE
    
        if p.islower():
            if len(r)>1:
                if len(z)==0:
                    print 'A'+'->'+'<'+p+'>'+'<'+r+'>'
                else:
                    print '<'+l+'>'+'->'+'<'+p+'>'+'<'+r+'>'

            elif len(r)==1 and r.isupper():
                print '<'+l+'>'+'->'+'<'+p+'>'+r
            else:
                print '<'+l+'>'+'->'+'<'+p+'>'+'<'+r+'>'
            z.append(p)
            z.append(r) 
        
        elif p.isupper():
            if len(r)>1:
                if len(z)==0:
                    print 'A'+'->'+p+'<'+r+'>'
                else:
                    print '<'+l+'>'+'->'+p+'<'+r+'>'

            elif len(r)==1 and r.isupper():
                print '<'+l+'>'+'->'+p+r
            else:
                print '<'+l+'>'+'->'+p+'<'+r+'>'
            z.append(r)     
              
  
m = raw_input()
z =[]
splitter(m)
for i in z:
    if len(i)==1 and i.islower():
        print '<'+i+'>'+'->'+i
    elif len(i)>1:
        m='<'+i+'>'+'->'+i
            #print i
        splitter(m)
    
        