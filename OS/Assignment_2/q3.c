#include <stdio.h>
#include <stdlib.h>

#define MAX_FILES 100
#define MAX_BLOCKS 100

typedef struct {
    int file_id;
    int block_id;
} FileBlock;

typedef struct {
    FileBlock file_blocks[MAX_BLOCKS];
    int num_blocks;
} IndexedFile;

void initialize_indexed_file(IndexedFile* file) {
    file->num_blocks = 0;
}

void add_file_block(IndexedFile* file, int file_id, int block_id) {
    if (file->num_blocks < MAX_BLOCKS) {
        file->file_blocks[file->num_blocks].file_id = file_id;
        file->file_blocks[file->num_blocks].block_id = block_id;
        file->num_blocks++;
    } else {
        printf("Error: Maximum number of blocks reached\n");
    }
}

void print_indexed_file(IndexedFile file) {
    for (int i = 0; i < file.num_blocks; i++) {
        printf("File ID: %d, Block ID: %d\n", file.file_blocks[i].file_id, file.file_blocks[i].block_id);
    }
}

int main() {
    IndexedFile file;
    initialize_indexed_file(&file);

    int n;
    printf("Enter the number of blocks: ");
    scanf("%d", &n);

    int choice;
    while (1) {
        printf("\nMenu:\n");
        printf("1. Add file block\n");
        printf("2. Print indexed file\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                int file_id, block_id;
                printf("Enter file ID: ");
                scanf("%d", &file_id);
                printf("Enter block ID: ");
                scanf("%d", &block_id);
                add_file_block(&file, file_id, block_id);
                break;
            case 2:
                print_indexed_file(file);
                break;
            case 3:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}
