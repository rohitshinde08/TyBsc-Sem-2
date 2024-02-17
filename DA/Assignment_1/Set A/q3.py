import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report
import numpy as np

# Set a seed for reproducibility
np.random.seed(42)

# Create the 'User' dataset with 500 entries
data = {
    'User ID': range(1, 501),
    'Gender': np.random.choice(['Male', 'Female'], size=500),
    'Age': np.random.randint(18, 65, 500),
    'EstimatedSalary': np.random.uniform(30000, 120000, 500),
    'Purchased': np.random.choice([0, 1], size=500)
}

user_df = pd.DataFrame(data)

# Identify independent (features) and target variable
X = user_df[['Age', 'EstimatedSalary']]
y = user_df['Purchased']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Standardize the features (optional but recommended for logistic regression)
scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)
X_test_scaled = scaler.transform(X_test)

# Build a logistic regression model
model = LogisticRegression(random_state=42)

# Fit the model on the training data
model.fit(X_train_scaled, y_train)

# Make predictions on the testing data
y_pred = model.predict(X_test_scaled)

# Evaluate the model
accuracy = accuracy_score(y_test, y_pred)
conf_matrix = confusion_matrix(y_test, y_pred)
classification_rep = classification_report(y_test, y_pred)

print("Model Evaluation:")
print("Accuracy:", accuracy)
print("\nConfusion Matrix:")
print(conf_matrix)
print("\nClassification Report:")
print(classification_rep)
