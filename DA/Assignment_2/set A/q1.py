import pandas as pd
from mlxtend.preprocessing import TransactionEncoder
from mlxtend.frequent_patterns import apriori,association_rules
transactions=[['bread','milk'],['bread','diaper','Beer','eggs'],['milk','diaper','Beer','Coke'],['bread','milk','diaper','Beer'],['bread','milk','diaper','Beer']]
te=TransactionEncoder()
te_array=te.fit(transactions).transform(transactions)
df=pd.DataFrame(te_array,columns=te.columns_)
print(df)
freq_items=apriori(df,min_support=0.5,use_colnames=True)
print(freq_items)
rules=association_rules(freq_items,metric='support',min_threshold=0.05)
rules=rules.sort_values(['support','confidence'],ascending=[False,False])
print(rules)
