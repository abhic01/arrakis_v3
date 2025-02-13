def add_quotes(row):
 values = row.split(",")
 output = ["'{}'".format(value) for value in values]
 return ",".join(output)

def csv_to_mysql(table, csv_data):
 csv_array = csv_data.split("\n")
 header_str = add_quotes(csv_array[1])
 sql_statement = ""
 for row in csv_array[2:-1]:
  row_str = add_quotes(row)
  sql_statement += "INSERT INTO {}({}) VALUES({}); \n".format(table, header_str, row_str)
 return sql_statement

csv_data = """
trade_type,trade_currency,quantity,trade_settlement_date,trade_status,trade_date,unit_price,coupon_percent,bond_currency,cusip,face_value (mn),isin,issuer_name,bond_maturity_date,status,type,book_name,bond_holder
buy,USD,50,04/08/2021,open,13/05/2021,90,4.37,USD,,1000,XS1988387210,"BNPParibasIssu 4,37% Microsoft Corp (USD)",05/08/2021,active,CORP,trading_book_1,AZ Holdings Inc
sell,GBP,40,04/08/2021,open,04/02/2021,89.56,4.37,USD,,1000,XS1988387210,"BNPParibasIssu 4,37% Microsoft Corp (USD)",05/08/2021,active,CORP,trading_book_1,AZ Holdings Inc
buy,USD,1000,23/08/2021,open,13/05/2021,105.775,3.15,USD,123456780,900,USN0280EAR64,Airbus 3.15%  USD,30/07/2021,active,CORP,trading_book_2,Acme co
sell,GBP,900,10/09/2021,open,04/02/2021,105.775,3.15,USD,123456780,900,USN0280EAR64,Airbus 3.15%  USD,30/07/2021,active,CORP,trading_book_2,Acme Co
buy,USD,50,23/08/2021,open,13/05/2021,90,2,USD,123456bh0,900,A12356111,UBS Facebook (USD),30/09/2021,active,CORP,Trading_book_3,Sovereign Investments
buy,USD,1000,23/08/2021,open,13/05/2021,105.775,3.15,USD,123456780,900,USN0280EAR64,Airbus 3.15%  USD,30/07/2021,active,CORP,trading_book_2,Astra Trading Ltd
sell,USD,50,23/08/2021,open,13/05/2021,90,2,USD,123456bh0,900,A12356111,UBS Facebook (USD),30/09/2021,active,CORP,Trading_book_2,Sovereign Investments
buy,GBP,60,27/09/2021,open,04/02/2021,98.56,3.15,USD,AMZN 3.15 08/22/27 REGS,900,USU02320AG12,Amazon,03/08/2021,active,CORP,Trading_book_4,Muncipal Gov Of Orange County
buy,USD,50,23/08/2021,open,23/08/2021,98.56,3.15,USD,AMZN 3.15 08/22/27 REGS,900,USU02320AG12,Amazon,03/08/2021,active,CORP,Trading_book_4,Muncipal Gov Of Orange County
buy,GBP,1100,27/09/2021,open,27/09/2021,110.35,0.75,GBP,BDCHBW8,900,GB00B6460505,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Goldman Sachs
sell,GBP,900,28/09/2021,open,28/09/2021,110.35,0.75,GBP,BDCHBW8,900,GB00B6460506,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Goldman Sachs
buy,GBP,2000,29/09/2021,open,29/09/2021,110.35,0.75,GBP,BDCHBW8,900,GB00B6460507,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,UBS
sell,GBP,2000,30/09/2021,open,30/09/2021,110.35,0.75,GBP,BDCHBW8,900,GB00B6460508,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,UBS
buy,GBP,1000,01/10/2021,open,01/10/2021,110.35,0.75,GBP,BDCHBW8,900,GB00B6460509,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Barclays
buy,GBP,900,02/10/2019,open,02/10/2019,110.35,0.75,GBP,BDCHBW8,900,GB00B6460510,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Barclays
sell,GBP,1900,03/10/2019,open,03/10/2019,110.35,0.75,GBP,BDCHBW8,900,GB00B6460511,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Barclays
buy,GBP,600,04/10/2018,open,04/10/2018,110.35,0.75,GBP,BDCHBW8,900,GB00B6460512,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,British Telecom
buy,GBP,600,05/10/2019,open,05/10/2019,110.35,0.75,GBP,BDCHBW8,900,GB00B6460513,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Pension Holdings
buy,GBP,700,06/06/2021,open,06/06/2021,110.35,0.75,GBP,BDCHBW8,900,GB00B6460514,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Pension Holdings
sell,GBP,1300,07/10/2021,open,07/10/2011,110.35,0.75,GBP,BDCHBW8,900,GB00B6460515,HM Treasury United Kingdon,09/08/2021,active,GOVN,Trading_book_6,Pension Holdings
buy,USD,60,27/09/2021,open,04/02/2012,100.13,2.02,USD,87973RAA8,690,US87973RAA86,TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S,06/08/2021,active,SOVN,Trading_book_4,Zurich Pension fund 4
buy,USD,50,23/08/2021,open,23/08/2012,100.13,2.02,USD,87973RAA8,690,US87973RAA86,TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S,06/08/2021,active,SOVN,Trading_book_4,Zurich Pension fund 4
buy,USD,75,27/09/2021,open,04/02/2013,100.13,2.02,USD,87973RAA8,690,US87973RAA86,TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S,06/08/2021,active,SOVN,Trading_book_4,Zurich Pension fund 4
buy,USD,50,23/08/2021,open,23/08/2014,100.13,2.02,USD,87973RAA8,690,US87973RAA86,TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S,06/08/2021,active,SOVN,Trading_book_4,Zurich Pension fund 4
buy,USD,300,27/09/2021,open,04/02/2016,98.76,1.123,USD,87973RAA8,340,IE00B29LNP31,First Norway Alpha Kl.IV,22/12/2030,active,SOVN,Trading_book_4,Zurich Pension fund 4
buy,USD,300,23/08/2021,open,23/08/2012,98.76,1.123,USD,87973RAA8,340,IE00B29LNP31,First Norway Alpha Kl.IV,22/12/2030,active,SOVN,Trading_book_4,Zurich Pension fund 4
buy,USD,300,27/09/2021,open,04/02/2013,98.76,1.123,USD,87973RAA8,340,IE00B29LNP31,First Norway Alpha Kl.IV,22/12/2030,active,SOVN,Trading_book_4,Zurich Pension fund 4
sell,USD,300,23/08/2021,open,23/08/2015,98.76,1.123,USD,87973RAA8,340,IE00B29LNP31,First Norway Alpha Kl.IV,22/12/2030,active,SOVN,Trading_book_4,Zurich Pension fund 4
"""

sql = csv_to_mysql('Customers',csv_data)
print(sql)
print("Execution Finished!")