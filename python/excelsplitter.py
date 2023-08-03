import pandas as pd
def create_excel_with_specific_columns(input_file, output_file, columns_to_keep):
    try:
        # Read the input Excel file
        df = pd.read_excel(input_file)

        # Select only the specified columns
        df = df[columns_to_keep]

        # Write the data to a new Excel file
        df.to_excel(output_file, index=False)

        print("New Excel file has been created successfully.")
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage:
if __name__ == "__main__":
    input_file_path = "./db-bonds-data.csv"
    output1_file_path = "./security.csv"
    output2_file_path = "./trade.csv"
    columns_to_keep1 = ["Column1", "Column2", "Column3"]  # Add the names of the columns you want to keep
    columns_to_keep2 = ["trade_type", "trade_currency", "quantity", "trade_status", "trade_date", "unit_price", "trade_settlement_date", ""]

    create_excel_with_specific_columns(input_file_path, output1_file_path, columns_to_keep1)
    create_excel_with_specific_columns(input_file_path, output2_file_path, columns_to_keep2)
