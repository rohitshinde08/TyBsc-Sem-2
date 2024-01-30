#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct file {
    char name[20];
    int start_block;
    int length;
    struct file* next_block;
};

int main() {
    int n, num_files, i, start_block, length;
    char file_name[20];

    printf("Enter the number of blocks in the disk: ");
    scanf("%d", &n);

    struct file* files = NULL;

    while (1) {
        printf("\n1. Create a new file\n");
        printf("2. Delete a file\n");
        printf("3. Display disk status\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &i);

        switch (i) {
            case 1:
                printf("\nEnter the name of the file: ");
                scanf("%s", file_name);
                printf("Enter the starting block number: ");
                scanf("%d", &start_block);
                printf("Enter the length of the file: ");
                scanf("%d", &length);

                if (start_block + length > n) {
                    printf("File allocation failed: not enough space\n");
                } else {
                    struct file* new_file = (struct file*) malloc(sizeof(struct file));
                    new_file->next_block = NULL;
                    strcpy(new_file->name, file_name);
                    new_file->start_block = start_block;
                    new_file->length = length;

                    if (files == NULL) {
                        files = new_file;
                    } else {
                        struct file* ptr = files;

                        while (ptr->next_block != NULL) {
                            ptr = ptr->next_block;
                        }

                        ptr->next_block = new_file;
                    }

                    printf("File %s created successfully\n", file_name);
                }

                break;
            case 2:
                printf("\nEnter the name of the file: ");
                scanf("%s", file_name);

                struct file* ptr = files;
                struct file* prev_ptr = NULL;

                while (ptr != NULL && strcmp(ptr->name, file_name) != 0) {
                    prev_ptr = ptr;
                    ptr = ptr->next_block;
                }

                if (ptr == NULL) {
                    printf("File deletion failed: file not found\n");
                } else {
                    if (prev_ptr == NULL) {
                        files = ptr->next_block;
                    } else {
                        prev_ptr->next_block = ptr->next_block;
                    }

                    free(ptr);
                    printf("File %s deleted successfully\n", file_name);
                }

                break;
            case 3:
                printf("\nDisk status:\n");

                int* blocks = (int*) calloc(n, sizeof(int));
                ptr = files;

                while (ptr != NULL) {
                    for (i = ptr->start_block; i < ptr->start_block + ptr->length; i++) {
                        blocks[i] = 1;
                    }

                    ptr = ptr->next_block;
                }

                for (i = 0; i < n; i++) {
                    if (blocks[i] == 0) {
                        printf("Block %d: Free\n", i);
                    } else {
                        printf("Block %d: Allocated\n", i);
                    }
                }

                free(blocks);
                break;
            case 4:
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }
}
